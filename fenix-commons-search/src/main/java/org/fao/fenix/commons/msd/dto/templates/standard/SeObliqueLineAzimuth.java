package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeObliqueLineAzimuth extends ResponseHandler {

    public SeObliqueLineAzimuth() {}
    public SeObliqueLineAzimuth(Object source) {
        super(source);
    }


    @JsonProperty
    public Double getAzimuthAngle() {
        return null;
    }
    @JsonProperty
    public Double getAzimuthMeasurePointLongitude() {
        return null;
    }

}
