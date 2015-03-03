package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DimensionType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeResourceDimensions extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> dimensionName;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private DimensionType dimensionType;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList dimensionSubject;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Object dimensionContent;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjMeasure dimensionMU;


    public Map<String, String> getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(Map<String, String> dimensionName) {
        this.dimensionName = dimensionName;
    }

    public DimensionType getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(DimensionType dimensionType) {
        this.dimensionType = dimensionType;
    }

    public OjCodeList getDimensionSubject() {
        return dimensionSubject;
    }
    @Embedded
    public void setDimensionSubject(OjCodeList dimensionSubject) {
        this.dimensionSubject = dimensionSubject;
    }

    public Object getDimensionContent() {
        return dimensionContent;
    }

    public void setDimensionContent(Object dimensionContent) {
        this.dimensionContent = dimensionContent;
    }

    public OjMeasure getDimensionMU() {
        return dimensionMU;
    }
    @Embedded
    public void setDimensionMU(OjMeasure dimensionMU) {
        this.dimensionMU = dimensionMU;
    }
}
