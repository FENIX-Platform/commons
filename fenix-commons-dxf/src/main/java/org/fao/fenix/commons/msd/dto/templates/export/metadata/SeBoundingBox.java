package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeBoundingBox extends ResponseHandler {

    public SeBoundingBox() {}
    public SeBoundingBox(Object source) {
        super(source);
    }


    @JsonProperty
    public Double getXmin() {
        return null;
    }
    @JsonProperty
    public Double getXmax() {
        return null;
    }
    @JsonProperty
    public Double getYmin() {
        return null;
    }
    @JsonProperty
    public Double getYmax() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeGridSpatialRepresentation getSeGridSpatialRepresentation() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeVectorSpatialRepresentation getSeVectorSpatialRepresentation() {
        return null;
    }

}
