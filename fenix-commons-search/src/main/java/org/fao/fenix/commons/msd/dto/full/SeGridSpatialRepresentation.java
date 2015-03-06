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
    @Label(en="Number of dimension")
    @Description(en= "Number of independent spatial-temporal axes. For ex-ample, a grid dataset representing the topography of an area has 3 dimensions: x, y for the planar representation of the area and z reporting the elevation value of each cell.")
    private Integer numberOfDimensions;

    @JsonProperty
    @Label(en="Information about spatial-temporal axis properties")
    @Description(en= "Reference to the OJ Dimensions object that reports information about spatial-temporal axis properties.")
    private OjAxis axisDimensionProperties;

    @JsonProperty
    @Label(en="Identication of grid data as point or cell")
    @Description(en= "Specifies whether each pixel of the raster data represents a point or an area. A raster with the cell geometry as point assumes that the features to represent, or the values to report, refers to the center of the cell; cell geometry as area represents the whole area covered by the cell (e.g. averages of values falling within the cell; dominant feature of the cell, etc.).")
    private CellGeometry cellGeometry;

    @JsonProperty
    @Label(en="Origin of raster cell")
    @Description(en= "Origin of the raster is the lower left or the upper left cell.")
    private CellOfOrigin cellOfOrigin;

    @JsonProperty
    @Label(en="Coordinate of the origin within the cell")
    @Description(en= "Whether coordinates of the origin of the raster refer to the center or the corner of the cell of origin.")
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
