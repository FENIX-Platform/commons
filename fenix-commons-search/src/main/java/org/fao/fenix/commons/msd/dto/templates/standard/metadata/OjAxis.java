package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.AxisType;

import java.util.Map;


public class OjAxis extends ResponseHandler {

    public OjAxis() {}
    public OjAxis(Object source) {
        super(source);
    }


    @JsonProperty
    public AxisType getAxisName() {
        return null;
    }
    @JsonProperty
    public Map<String,String> getAxisNameLabel() {
        AxisType value = getAxisName();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public Integer getAxisSize() {
        return null;
    }
    @JsonProperty
    public OjMeasure getResolution() {
        return null;
    }

}
