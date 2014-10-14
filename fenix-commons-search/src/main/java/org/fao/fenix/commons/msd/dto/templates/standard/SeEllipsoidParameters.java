package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeEllipsoidParameters extends ResponseHandler {

    public SeEllipsoidParameters() {}
    public SeEllipsoidParameters(Object source) {
        super(source);
    }


    @JsonProperty
    public Double getSemiMajorAxis() {
        return null;
    }
    @JsonProperty
    public OjMeasure getAxisUnits() {
        return null;
    }
    @JsonProperty
    public Double getDenominatorOfFlatteringRatio() {
        return null;
    }

}
