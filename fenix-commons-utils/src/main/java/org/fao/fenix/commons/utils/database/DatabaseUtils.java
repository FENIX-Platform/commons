package org.fao.fenix.commons.utils.database;

import java.sql.*;
import java.util.Collection;

public class DatabaseUtils {



    public void fillStatement(PreparedStatement statement, int[] types, Object... row) throws SQLException {
        for (int i=0; i<row.length; i++)
            if (row[i]!=null)
                statement.setObject(i+1, row[i], types[i]);
            else
                statement.setNull(i+1, types[i]);
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