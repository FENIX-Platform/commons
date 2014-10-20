package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeBoundingBox extends JSONEntity implements Serializable {

    @JsonProperty private Double xMin;
    @JsonProperty private Double xMax;
    @JsonProperty private Double yMin;
    @JsonProperty private Double yMax;

    @JsonProperty private SeGridSpatialRepresentation seGridSpatialRepresentation;
    @JsonProperty private SeVectorSpatialRepresentation seVectorSpatialRepresentation;


    public Double getxMin() {
        return xMin;
    }

    public void setxMin(Double xMin) {
        this.xMin = xMin;
    }

    public Double getxMax() {
        return xMax;
    }

    public void setxMax(Double xMax) {
        this.xMax = xMax;
    }

    public Double getyMin() {
        return yMin;
    }

    public void setyMin(Double yMin) {
        this.yMin = yMin;
    }

    public Double getyMax() {
        return yMax;
    }

    public void setyMax(Double yMax) {
        this.yMax = yMax;
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
