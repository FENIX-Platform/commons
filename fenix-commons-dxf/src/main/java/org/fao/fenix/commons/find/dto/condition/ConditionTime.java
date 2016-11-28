package org.fao.fenix.commons.find.dto.condition;

import org.fao.fenix.commons.find.dto.filter.TimeFilter;

public class ConditionTime extends TimeFilter {

    //Query utils

    public static final String fromFieldNameSuffix = "|from";
    public static final String toFieldNameSuffix = "|to";


    public ConditionTime() {

    }

    public ConditionTime(Long from , Long to) {
        this.from = from;
        this.to = to;
    }


}
