package org.fao.fenix.commons.utils.database;

import java.sql.*;
import java.util.Collection;
import java.util.LinkedList;

public class DatabaseUtils {



    public PreparedStatement fillStatement(PreparedStatement statement, Integer[] types, Object ... params) throws SQLException {
        if (params!=null && params.length>0)
            if (types==null || types.length!=params.length) {
                for (int i = 0; i < params.length; i++)
                    if (params[i] != null)
                        statement.setObject(i + 1, params[i]);
                    else
                        throw new SQLException("Unknown type for 'null' query parameter");
            } else {
                for (int i = 0; i < params.length; i++)
                    if (params[i] != null)
                        statement.setObject(i + 1, params[i], types[i]);
                    else
                        statement.setNull(i + 1, types[i]);
            }
        return statement;
    }

    public Collection<Object[]> getDataCollection (ResultSet rawData) throws SQLException {
        Collection<Object[]> data = new LinkedList<>();
        int columnsNumber = rawData.getMetaData().getColumnCount();
        while (rawData.next()) {
            Object[] row = new Object[columnsNumber];
            for (int i=0; i<columnsNumber; i++)
                row[i] = rawData.getObject(i+1);
            data.add(row);
        }
        return data;
    }


    public Iterator<Object[]> getDataIterator(Collection<Object[]> data) {
        return data!=null ? getDataIterator(data.iterator()) : null;
    }
    public Iterator<Object[]> getDataIterator(final java.util.Iterator<Object[]> iterator) {
        return iterator instanceof Iterator ? (Iterator)iterator :
                new Iterator<Object[]>() {
                    @Override
                    public void skip(long amount) {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public long getIndex() {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public boolean hasNext() {
                        return iterator.hasNext();
                    }

                    @Override
                    public Object[] next() {
                        return iterator.next();
                    }

                    @Override
                    public void remove() {
                        iterator.remove();
                    }
                };
    }

}