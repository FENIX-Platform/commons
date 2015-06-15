package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.LayerType;

import java.util.Map;

public class MeSpatialRepresentation extends ResponseHandler {

    public MeSpatialRepresentation() {}
    public MeSpatialRepresentation(Object source) {
        super(source);
    }


    @JsonProperty
    public LayerType getLayerType() {
        return null;
    }


    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getTypeOfProduct() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getProcessing() {
        return null;
    }
    @JsonProperty
    public String getNoDataValue() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeBoundingBox getSeBoundingBox() {
        return null;
    }

}
