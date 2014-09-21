package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.CellGeometry;
import org.fao.fenix.commons.msd.dto.type.CellOfOrigin;
import org.fao.fenix.commons.msd.dto.type.XYPosition;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeGridSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty private Integer numberOfDimensions;
    @JsonProperty private OjAxis axisDimensionProperties;
    @JsonProperty private CellGeometry cellGeometry;
    @JsonProperty private CellOfOrigin cellOfOrigin;
    @JsonProperty private XYPosition XYposition;


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

    public XYPosition getXYposition() {
        return XYposition;
    }

    public void setXYposition(XYPosition XYposition) {
        this.XYposition = XYposition;
    }
}
