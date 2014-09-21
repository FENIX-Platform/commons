package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeObliqueLineAzimuth extends JSONEntity implements Serializable {

    @JsonProperty private Double azimuthAngle;
    @JsonProperty private Double azimuthMeasurePointLongitude;


    public Double getAzimuthAngle() {
        return azimuthAngle;
    }

    public void setAzimuthAngle(Double azimuthAngle) {
        this.azimuthAngle = azimuthAngle;
    }

    public Double getAzimuthMeasurePointLongitude() {
        return azimuthMeasurePointLongitude;
    }

    public void setAzimuthMeasurePointLongitude(Double azimuthMeasurePointLongitude) {
        this.azimuthMeasurePointLongitude = azimuthMeasurePointLongitude;
    }
}
