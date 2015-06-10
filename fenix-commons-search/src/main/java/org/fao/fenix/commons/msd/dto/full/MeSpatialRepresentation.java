package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.LayerType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Type of layer")
    @Description(en= "Layer typology: vector or raster spatial representation.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private LayerType layerType;

    @JsonProperty
    @Label(en="Type of product")
    @Description(en= "Coded information about the product managed.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private OjCodeList typeOfProduct;

    @JsonProperty
    @Label(en="Processing")
    @Description(en= "Analytical method used to process the geographic dataset.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private OjCodeList processing;

    @JsonProperty
    @Label(en="Value assigned to No-data")
    @Description(en= "Value assigned to the cells to represent the absence of data.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private String noDataValue;

    @JsonProperty
    @Label(en="Bounding Box")
    @Description(en= "This section includes the planar measurement units used to express the X,Y values. The bounding box indicates the smaller quadrilateral shape that includes all features of the considered resource.")
    @Order(5)
    @Format(Format.FORMAT.string)
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
