package org.fao.fenix.commons.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

public class DataIterator extends TimerTask implements Iterator<Object[]> {
    private ResultSet source;
    private Connection connection;
    private Long timeout;
    private long lastAction;

    private int columnsNumber;
    private Object[] next = null;
    private boolean consumed = true;


    public DataIterator(ResultSet source, Connection connection, Long timeout) throws SQLException {
        this.source = source;
        this.connection = connection;
        this.timeout = timeout;

        columnsNumber = source.getMetaData().getColumnCount();

        //If a timeout exists start a timer to manage it
        if (connection!=null && timeout!=null) {
            lastAction = System.currentTimeMillis();
            new Timer().schedule(this, 1000);
        }
    }


    //TIMEOUT MANAGEMENT
    @Override
    public void run() {
        if (timeout!=null)
            if (timeout < System.currentTimeMillis()-lastAction) {
                try {
                    if (!connection.isClosed())
                        connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else
                new Timer().schedule(this, 1000);
    }




    //PRODUCER
    private Object[] loadNext() throws SQLException {
        if (consumed) {
            consumed = false;
            if (source.next()) {
                next = new Object[columnsNumber];
                for (int i = 0; i < columnsNumber; i++)
                    next[i] = source.getObject(i + 1);
            } else
                next = null;
        }
        //Close connection
        if (next==null && connection!=null && !connection.isClosed()) {
            connection.close();
            timeout = null;
        }

        return next;
    }

    @Override
    public boolean hasNext() {
        try {
            return loadNext()!=null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object[] next() {
        Object[] row = null;
        try {
            row = loadNext();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        consumed = true;
        return row;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


    @Override
    public void skip(int amount) {
        try {
            if (amount>=0) {
                source.relative(amount);
                consumed = true;
                loadNext();
            }
        } catch (SQLException e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int getIndex() {
        try {
            return source.getRow();
        } catch (SQLException e) {
            throw new UnsupportedOperationException();
        }

    }


}
