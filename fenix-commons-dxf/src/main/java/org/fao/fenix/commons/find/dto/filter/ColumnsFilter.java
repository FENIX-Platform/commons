package org.fao.fenix.commons.find.dto.filter;


import java.util.Collection;
import java.util.LinkedList;

public class ColumnsFilter {

    private Collection<String> columns;


    public Collection<String> getColumns() {
        return columns;
    }

    public void setColumns(Collection<String> columns) {
        this.columns = columns;
    }


    //Utils
    public void addColumn(String name) {
        if (name!=null) {
            if (columns == null)
                columns = new LinkedList<>();
            columns.add(name);
        }
    }

}
