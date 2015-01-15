package org.fao.fenix.commons.utils;

import java.sql.*;
import java.util.TimerTask;

public class DatabaseUtils {



    public void fillStatement(PreparedStatement statement, int[] types, Object... row) throws SQLException {
        for (int i=0; i<row.length; i++)
            if (row[i]!=null)
                statement.setObject(i+1, row[i], types[i]);
            else
                statement.setNull(i+1, types[i]);
    }

    public Iterator<Object[]> getDataIterator(ResultSet source) throws SQLException {
        return new DataIterator(source,null,null);
    }

    public Iterator<Object[]> getDataIterator(ResultSet source, Connection connection) throws SQLException {
        return new DataIterator(source,connection,null);
    }

    public Iterator<Object[]> getDataIterator(ResultSet source, Connection connection, Long timeout) throws SQLException {
        return new DataIterator(source,connection,timeout);
    }

}