package org.fao.fenix.commons.search.dto.filter;

import org.fao.fenix.commons.utils.JSONUtils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ResourceFilter {
    private String[] types = new String[] {"dataset","codelist","layer"};
    private QueryString queryString;
    private LinkedHashMap<String, Collection<ColumnValueFilter>> metadata = new LinkedHashMap<>();
    private LinkedHashMap<String, Collection<ColumnValueFilter>> data = new LinkedHashMap<>();



    public String[] getTypes() { return types; }

    public void setTypes(String[] types) {
        if (types!=null && types.length>0)
            this.types = types;
    }

    public LinkedHashMap<String, Collection<ColumnValueFilter>> getMetadata() {
        return metadata;
    }

    public void setMetadata(LinkedHashMap<String, Collection<ColumnValueFilter>> metadata) {
        this.metadata = metadata;
    }

    public LinkedHashMap<String, Collection<ColumnValueFilter>> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, Collection<ColumnValueFilter>> data) {
        this.data = data;
    }

    public QueryString getQueryString() { return queryString; }

    public void setQueryString(QueryString queryString) { this.queryString = queryString; }



    //Utils
    public void addMetadata(String field, ColumnValueFilter filter) {
        if (field!=null && filter!=null && filter.getType()!=ValueFilterType.unknown) {
            Collection<ColumnValueFilter> fieldFilter = metadata.get(field);
            if (fieldFilter==null)
                metadata.put(field, fieldFilter = new LinkedList<ColumnValueFilter>());
            fieldFilter.add(filter);
        }
    }
    public void addData(String field, ColumnValueFilter filter) {
        if (field!=null && filter!=null && filter.getType()!=ValueFilterType.unknown) {
            Collection<ColumnValueFilter> fieldFilter = data.get(field);
            if (fieldFilter==null)
                data.put(field, fieldFilter = new LinkedList<ColumnValueFilter>());
            fieldFilter.add(filter);
        }
    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        try { return JSONUtils.cloneByJSON(this);
        } catch (Exception e) {
            throw new CloneNotSupportedException();
        }
    }

}
