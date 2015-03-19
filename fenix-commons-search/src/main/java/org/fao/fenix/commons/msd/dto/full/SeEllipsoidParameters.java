package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeEllipsoidParameters extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Semi major axis")
    @Description(en= "Measure of the equatorial axis of the ellipsoid.")
    private Double semiMajorAxis;

    @JsonProperty
    @Label(en="Semi-major axis unit of measure")
    @Description(en= "Units of the semi-major axis.")
    private OjMeasure axisUnits;

    @JsonProperty
    @Label(en="Deniminator of flattening rate")
    @Description(en= "Ratio between the semi-major axis and the semi-minor axis of an ellipse. Generally an ellipse is completely specified by the measure of the semi-major axis 'a' and the measure of the semi-minor axis 'b'.")
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
