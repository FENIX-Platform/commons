package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.LayerType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty private LayerType layerType;
    @JsonProperty private OjCodeList typeOfProduct;
    @JsonProperty private String noDataValue;

    @JsonProperty private SeBoundingBox seBoundingBox;


    public LayerType getLayerType() {
        return layerType;
    }

    public void setLayerType(LayerType layerType) {
        this.layerType = layerType;
    }

    public OjCodeList getTypeOfProduct() {
        return typeOfProduct;
    }
    @Embedded
    public void setTypeOfProduct(OjCodeList typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getNoDataValue() {
        return noDataValue;
    }

    public void setNoDataValue(String noDataValue) {
        this.noDataValue = noDataValue;
    }

    public SeBoundingBox getSeBoundingBox() {
        return seBoundingBox;
    }
    @Embedded
    public void setSeBoundingBox(SeBoundingBox seBoundingBox) {
        this.seBoundingBox = seBoundingBox;
    }
}
