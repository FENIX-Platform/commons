package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeBoundingBox extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="West bound longitude")
    @Description(en= "The smaller X coordinate value delimiting the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double xmin;

    @JsonProperty
    @Label(en="East bound longitude")
    @Description(en= "The higher X coordinate value delimiting the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double xmax;

    @JsonProperty
    @Label(en="South bound latitude")
    @Description(en= "The smaller Y coordinate value delimiting the resource (mandatory.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double ymin;

    @JsonProperty
    @Label(en="North bound latitude")
    @Description(en= "The higher Y coordinate value delimiting the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double ymax;

    @JsonProperty
    @Label(en="Grid Spatial Representation")
    @Description(en= "This section reports the parameters about a grid (raster) resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private SeGridSpatialRepresentation seGridSpatialRepresentation;

    @JsonProperty
    @Label(en="Vector Spatial Representation")
    @Description(en= "This section reports information about the vector spatial objects in the dataset.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private SeVectorSpatialRepresentation seVectorSpatialRepresentation;


    public Double getXmin() {
        return xmin;
    }

    public void setXmin(Double xMin) {
        this.xmin = xMin;
    }

    public Double getXmax() {
        return xmax;
    }

    public void setXmax(Double xMax) {
        this.xmax = xMax;
    }

    public Double getYmin() {
        return ymin;
    }

    public void setYmin(Double yMin) {
        this.ymin = yMin;
    }

    public Double getYmax() {
        return ymax;
    }

    public void setYmax(Double yMax) {
        this.ymax = yMax;
    }

    public SeGridSpatialRepresentation getSeGridSpatialRepresentation() {
        return seGridSpatialRepresentation;
    }
    @Embedded
    public void setSeGridSpatialRepresentation(SeGridSpatialRepresentation seGridSpatialRepresentation) {
        this.seGridSpatialRepresentation = seGridSpatialRepresentation;
    }

    public SeVectorSpatialRepresentation getSeVectorSpatialRepresentation() {
        return seVectorSpatialRepresentation;
    }
    @Embedded
    public void setSeVectorSpatialRepresentation(SeVectorSpatialRepresentation seVectorSpatialRepresentation) {
        this.seVectorSpatialRepresentation = seVectorSpatialRepresentation;
    }
}
