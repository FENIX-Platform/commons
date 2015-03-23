package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.AxisType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class OjAxis extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Name of axis")
    @Description(en="Name of the axis.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private AxisType axisName;

    @JsonProperty
    @Label(en="Axis size")
    @Description(en="Number of elements along the axis.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Integer axisSize;

    @JsonProperty
    @Label(en="Resolution")
    @Description(en="Degree of detail in the grid dataset.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjMeasure resolution;


    public AxisType getAxisName() {
        return axisName;
    }

    public void setAxisName(AxisType axisName) {
        this.axisName = axisName;
    }

    public Integer getAxisSize() {
        return axisSize;
    }

    public void setAxisSize(Integer axisSize) {
        this.axisSize = axisSize;
    }

    public OjMeasure getResolution() {
        return resolution;
    }
    @Embedded
    public void setResolution(OjMeasure resolution) {
        this.resolution = resolution;
    }
}
