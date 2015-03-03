package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeObliqueLineAzimuth extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double azimuthAngle;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double azimuthMeasurePointLongitude;


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
