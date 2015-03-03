package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.CellGeometry;
import org.fao.fenix.commons.msd.dto.type.CellOfOrigin;
import org.fao.fenix.commons.msd.dto.type.XYPosition;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeGridSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Integer numberOfDimensions;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjAxis axisDimensionProperties;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private CellGeometry cellGeometry;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private CellOfOrigin cellOfOrigin;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private XYPosition xyPosition;


    public Integer getNumberOfDimensions() {
        return numberOfDimensions;
    }

    public void setNumberOfDimensions(Integer numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public OjAxis getAxisDimensionProperties() {
        return axisDimensionProperties;
    }
    @Embedded
    public void setAxisDimensionProperties(OjAxis axisDimensionProperties) {
        this.axisDimensionProperties = axisDimensionProperties;
    }

    public CellGeometry getCellGeometry() {
        return cellGeometry;
    }

    public void setCellGeometry(CellGeometry cellGeometry) {
        this.cellGeometry = cellGeometry;
    }

    public CellOfOrigin getCellOfOrigin() {
        return cellOfOrigin;
    }

    public void setCellOfOrigin(CellOfOrigin cellOfOrigin) {
        this.cellOfOrigin = cellOfOrigin;
    }

    public XYPosition getXyPosition() {
        return xyPosition;
    }

    public void setXyPosition(XYPosition xyPosition) {
        this.xyPosition = xyPosition;
    }
}
