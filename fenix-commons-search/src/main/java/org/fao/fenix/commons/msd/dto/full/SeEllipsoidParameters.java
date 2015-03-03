package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeEllipsoidParameters extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double semiMajorAxis;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjMeasure axisUnits;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double denominatorOfFlatteringRatio;


    public Double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(Double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public OjMeasure getAxisUnits() {
        return axisUnits;
    }
    @Embedded
    public void setAxisUnits(OjMeasure axisUnits) {
        this.axisUnits = axisUnits;
    }

    public Double getDenominatorOfFlatteringRatio() {
        return denominatorOfFlatteringRatio;
    }

    public void setDenominatorOfFlatteringRatio(Double denominatorOfFlatteringRatio) {
        this.denominatorOfFlatteringRatio = denominatorOfFlatteringRatio;
    }
}
