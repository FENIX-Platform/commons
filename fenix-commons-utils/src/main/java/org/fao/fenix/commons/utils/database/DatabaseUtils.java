package org.fao.fenix.commons.utils.database;

import java.sql.*;

public class DatabaseUtils {



    public void fillStatement(PreparedStatement statement, int[] types, Object... row) throws SQLException {
        for (int i=0; i<row.length; i++)
            if (row[i]!=null)
                statement.setObject(i+1, row[i], types[i]);
            else
                statement.setNull(i+1, types[i]);
    }

}