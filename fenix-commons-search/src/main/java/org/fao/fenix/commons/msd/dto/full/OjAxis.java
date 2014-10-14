package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.AxisType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class OjAxis extends JSONEntity implements Serializable {

    @JsonProperty private AxisType axisName;
    @JsonProperty private Integer axisSize;
    @JsonProperty private OjMeasure resolution;


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
