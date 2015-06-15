package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.GeometricObjects;

import java.util.Map;


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
    @JsonProperty
    public Map<String,String> getGeometricObjectsLabel() {
        GeometricObjects value = getGeometricObjects();
        return value!=null ? value.getLabel() : null;
    }

}
