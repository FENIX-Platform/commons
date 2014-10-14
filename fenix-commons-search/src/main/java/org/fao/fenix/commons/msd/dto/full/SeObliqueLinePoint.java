package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeObliqueLinePoint extends JSONEntity implements Serializable {

    @JsonProperty private Double obliqueLineLatitude;
    @JsonProperty private Double obliqueLineLongitude;


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
