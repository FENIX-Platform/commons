package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeBoundingBox extends ResponseHandler {

    public SeBoundingBox() {}
    public SeBoundingBox(Object source) {
        super(source);
    }


    @JsonProperty
    public Double getxMin() {
        return null;
    }
    @JsonProperty
    public Double getxMax() {
        return null;
    }
    @JsonProperty
    public Double getyMin() {
        return null;
    }
    @JsonProperty
    public Double getyMax() {
        return null;
    }
    @JsonProperty
    public SeGridSpatialRepresentation getSeGridSpatialRepresentation() {
        return null;
    }
    @JsonProperty
    public SeVectorSpatialRepresentation getSeVectorSpatialRepresentation() {
        return null;
    }

}
