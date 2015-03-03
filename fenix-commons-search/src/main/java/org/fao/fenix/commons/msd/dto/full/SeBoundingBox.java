package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeBoundingBox extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double xmin;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double xmax;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double ymin;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double ymax;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeGridSpatialRepresentation seGridSpatialRepresentation;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
