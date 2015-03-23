package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DimensionType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeResourceDimensions extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Dimension name")
    @Description(en= "Name of the dimension as indicated in the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> dimensionName;

    @JsonProperty
    @Label(en="Dimension type")
    @Description(en= "Data type of the dimension (e.g. free-text, coded).")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private DimensionType dimensionType;

    @JsonProperty
    @Label(en="Dimension type")
    @Description(en= "Coded element that indicates the CodeList main subject-theme.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjCodeList dimensionSubject;

    @JsonProperty
    @Label(en="Dimension content")
    @Description(en= "List of the values of the considered dimension occurring in the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Object dimensionContent;

    @JsonProperty
    @Label(en="Measurement units")
    @Description(en= "Measurement units of the data values.")
    @Order(-1)
    @Format(Format.FORMAT.string)
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
