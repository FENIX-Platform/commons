package org.fao.fenix.commons.msd.dto.data;

import java.util.Collection;

public class FieldFilter {

    public Collection<CodesFilter> codes;
    public Collection<String> enumeration;
    public Collection<TimeFilter> time;


    //Utils
    public enum FilterType {
        code,enumeration,time, other
    }
    public FilterType getFilterType() {
        if (codes!=null && codes.size()>0)
            return FilterType.code;
        if (enumeration!=null && enumeration.size()>0)
            return FilterType.enumeration;
        if (time!=null && time.size()>0)
            return FilterType.time;
        return FilterType.other;
    }
}
