package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeEllipsoidParameters extends ResponseHandler {

    public SeEllipsoidParameters() {}
    public SeEllipsoidParameters(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Double getSemiMajorAxis() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjMeasure getAxisUnits() {
        return null;
    }
    @JsonProperty
    public Double getDenominatorOfFlatteringRatio() {
        return null;
    }

}
