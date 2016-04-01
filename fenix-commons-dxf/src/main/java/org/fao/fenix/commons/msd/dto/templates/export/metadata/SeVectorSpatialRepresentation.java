package org.fao.fenix.commons.msd.dto.templates.export.metadata;

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
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getTopologyLevel() {
        return null;
    }
    @JsonProperty
    public GeometricObjects getGeometricObjects() {
        return null;
    }

    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getMapUnit() {
        return null;
    }

    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OJScale getScaleRange() {
        return null;
    }

}
