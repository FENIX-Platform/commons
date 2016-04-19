package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeObliqueLinePoint extends ResponseHandler {

    public SeObliqueLinePoint() {}
    public SeObliqueLinePoint(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Double getObliqueLineLatitude() {
        return null;
    }
    @JsonProperty
    public Double getObliqueLineLongitude() {
        return null;
    }

}
