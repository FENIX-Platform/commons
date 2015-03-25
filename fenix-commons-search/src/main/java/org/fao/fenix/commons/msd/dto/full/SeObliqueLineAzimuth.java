package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeObliqueLineAzimuth extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Azimuth angle")
    @Description(en= "Measure clockwise from north and express in degree of the angle.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Double azimuthAngle;

    @JsonProperty
    @Label(en="Longitude of the map projection origin")
    @Description(en="Longitude of the origin in the map projection.")
    @Order(2)
    @Format(Format.FORMAT.string)
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
