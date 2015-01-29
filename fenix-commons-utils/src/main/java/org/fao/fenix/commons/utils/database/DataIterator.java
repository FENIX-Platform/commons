package org.fao.fenix.commons.utils.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DataIterator extends TimerTask implements Iterator<Object[]> {
    private java.util.Iterator<ResultSet> sources;
    private ResultSet source;
    private Connection connection;
    private Long timeout;
    private long lastAction;

    private int columnsNumber;
    private Object[] next;
    private boolean consumed = true;

    private Object[] currentDefaultValues;
    private Collection<Object[]> defaultValues;




    public DataIterator(ResultSet source, Connection connection, Long timeout, Object[] currentDefaultValues) throws SQLException {
        this(source!=null ? Arrays.asList(source) : null, connection, timeout, currentDefaultValues!=null ? (Collection<Object[]>)Arrays.asList(new Object[][] {currentDefaultValues}) : null);
    }

    public DataIterator(Collection<ResultSet> sources, Connection connection, Long timeout, Collection<Object[]> defaultValues) throws SQLException {
        if (sources==null || sources.size()==0)
            throw new SQLException("No source data for the data producer iterator");

        this.sources = sources.iterator();
        this.source = this.sources.next();
        this.connection = connection;
        this.timeout = timeout;

        columnsNumber = source.getMetaData().getColumnCount();

        //If a timeout exists start a timer to manage it
        if (connection!=null && timeout!=null) {
            lastAction = System.currentTimeMillis();
            new Timer().schedule(this, 1000);
        }
    }

    private void close() {
        try {
            if (connection!=null && !connection.isClosed()) {
                timeout = null;
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
        lastAction = System.currentTimeMillis();
        if (consumed) {
            if (source.next()) {
                next = new Object[columnsNumber];
                for (int i = 0; i < columnsNumber; i++)
                    next[i] = source.getObject(i + 1);
            } else {
                //Try to switch to the next source
                for (source = null; sources.hasNext() && (source=sources.next())==null;);
                if (source!=null) {
                    columnsNumber = source.getMetaData().getColumnCount();
                    return loadNext();
                } else
                    next = null;
            }
            consumed = false;
        }
        if (next==null)
            close();

        return next;
    }

    @Override
    public boolean hasNext() {
        try {
            return loadNext()!=null;
        } catch (SQLException e) {
            close();
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object[] next() {
        Object[] row;
        try {
            row = loadNext();
        } catch (SQLException e) {
            close();
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
