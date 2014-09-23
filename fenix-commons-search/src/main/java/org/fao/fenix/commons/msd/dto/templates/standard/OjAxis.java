package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.AxisType;


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
    public Integer getAxisSize() {
        return null;
    }
    @JsonProperty
    public OjMeasure getResolution() {
        return null;
    }

}
