package org.fao.fenix.commons.msd.dto.templates.standard;

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
    public Map<String,String> getLayerTypeLabel() {
        LayerType value = getLayerType();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public OjCodeList getTypeOfProduct() {
        return null;
    }
    @JsonProperty
    public OjCodeList getProcessing() {
        return null;
    }
    @JsonProperty
    public String getNoDataValue() {
        return null;
    }
    @JsonProperty
    public SeBoundingBox getSeBoundingBox() {
        return null;
    }

}
