package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.AxisType;

import javax.persistence.Embedded;
import java.io.Serializable;

public class OjAxis extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private AxisType axisName;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Integer axisSize;

    @JsonProperty
    @Label(en="")
    @Description(en="")
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
