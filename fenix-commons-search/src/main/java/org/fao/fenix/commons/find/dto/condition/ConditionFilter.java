package org.fao.fenix.commons.find.dto.condition;

import org.fao.fenix.commons.find.dto.type.FieldFilterType;

import java.util.Collection;

public class ConditionFilter {

    public String fieldName;
    public FieldFilterType filterType;
    public Collection<Object> values;

    public ConditionFilter() {
    }
    public ConditionFilter(String fieldName, FieldFilterType filterType, Collection<Object> values) {
        this.fieldName = fieldName;
        this.filterType = filterType;
        this.values = values;
    }
}
