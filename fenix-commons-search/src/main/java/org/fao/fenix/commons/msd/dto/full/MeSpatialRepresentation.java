package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.LayerType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private LayerType layerType;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList typeOfProduct;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList processing;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private String noDataValue;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeBoundingBox seBoundingBox;


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

    public OjCodeList getProcessing() {
        return processing;
    }
    @Embedded
    public void setProcessing(OjCodeList processing) {
        this.processing = processing;
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
