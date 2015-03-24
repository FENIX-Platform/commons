package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeObliqueLinePoint extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Oblique line latitude")
    @Description(en= "Latitude of a point defining the oblique line.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double obliqueLineLatitude;

    @JsonProperty
    @Label(en="Oblique line longitude")
    @Description(en= "Longitude of a point defining the oblique line.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double obliqueLineLongitude;


    public Double getObliqueLineLatitude() {
        return obliqueLineLatitude;
    }

    public void setObliqueLineLatitude(Double obliqueLineLatitude) {
        this.obliqueLineLatitude = obliqueLineLatitude;
    }

    public Double getObliqueLineLongitude() {
        return obliqueLineLongitude;
    }

    public void setObliqueLineLongitude(Double obliqueLineLongitude) {
        this.obliqueLineLongitude = obliqueLineLongitude;
    }
}
