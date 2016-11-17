package org.fao.fenix.commons.find.dto.filter;

import org.fao.fenix.commons.find.dto.type.VariableValueType;

public class Variable {

    private String key;
    private Object value;
    private VariableValueType type;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public VariableValueType getType() {
        return type;
    }

    public void setType(VariableValueType type) {
        this.type = type;
    }
}
