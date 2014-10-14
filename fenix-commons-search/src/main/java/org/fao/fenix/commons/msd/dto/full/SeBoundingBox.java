package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeBoundingBox extends JSONEntity implements Serializable {

    @JsonProperty private Double Xmin;
    @JsonProperty private Double Xmax;
    @JsonProperty private Double Ymin;
    @JsonProperty private Double Ymax;

    @JsonProperty private SeGridSpatialRepresentation seGridSpatialRepresentation;
    @JsonProperty private SeVectorSpatialRepresentation seVectorSpatialRepresentation;


    public Double getXmin() {
        return Xmin;
    }

    public void setXmin(Double xmin) {
        Xmin = xmin;
    }

    public Double getXmax() {
        return Xmax;
    }

    public void setXmax(Double xmax) {
        Xmax = xmax;
    }

    public Double getYmin() {
        return Ymin;
    }

    public void setYmin(Double ymin) {
        Ymin = ymin;
    }

    public Double getYmax() {
        return Ymax;
    }

    public void setYmax(Double ymax) {
        Ymax = ymax;
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
