package org.fao.fenix.commons.find.dto.filter;

import org.fao.fenix.commons.find.dto.type.FieldFilterType;

import java.util.Collection;

public class FieldFilter {

    public Collection<IdFilter> ids;
    public Collection<CodesFilter> codes;
    public Collection<ContactFilter> contacts;
    public Collection<String> enumeration;
    public Collection<TimeFilter> time;
    public Collection<NumberFilter> number;
    public Collection<TableFilter> tables;
    public Boolean bool;
    public String freeText;


    //Utils
    public FieldFilterType retrieveFilterType() {
        if (ids!=null && ids.size()>0)
            return FieldFilterType.id;
        if (codes!=null && codes.size()>0)
            return FieldFilterType.code;
        if (contacts!=null && contacts.size()>0)
            return FieldFilterType.contact;
        if (enumeration!=null && enumeration.size()>0)
            return FieldFilterType.enumeration;
        if (time!=null && time.size()>0)
            return FieldFilterType.time;
        if (number !=null && number.size()>0)
            return FieldFilterType.number;
        if (tables!=null && tables.size()>0)
            return FieldFilterType.table;
        if (bool!=null)
            return FieldFilterType.bool;
        if (freeText!=null)
            return FieldFilterType.free;
        return FieldFilterType.other;
    }

}
