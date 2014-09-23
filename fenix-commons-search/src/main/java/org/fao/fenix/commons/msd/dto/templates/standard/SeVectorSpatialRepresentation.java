package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.GeometricObjects;


public class SeVectorSpatialRepresentation extends ResponseHandler {

    public SeVectorSpatialRepresentation() {}
    public SeVectorSpatialRepresentation(Object source) {
        super(source);
    }


    @JsonProperty
    public OjCodeList getTopologyLevel() {
        return null;
    }
    @JsonProperty
    public GeometricObjects getGeometricObjects() {
        return null;
    }

}
