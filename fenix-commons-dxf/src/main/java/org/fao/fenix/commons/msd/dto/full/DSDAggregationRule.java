package org.fao.fenix.commons.msd.dto.full;

import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DSDAggregationRule extends JSONEntity implements Serializable {
    private String name;
    private Map<String, Object> parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }


    //The clone function use only with get/set for proxy compatibility
    //The copy has no RID
    @Override
    public DSDAggregationRule clone() {
        DSDAggregationRule clone = new DSDAggregationRule();
        clone.setName(getName());
        clone.setParameters(getParameters()!=null ? new HashMap<>(getParameters()) : null);
        return clone;
    }
}
