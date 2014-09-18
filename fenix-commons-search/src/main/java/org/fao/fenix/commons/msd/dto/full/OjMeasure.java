package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class OjMeasure extends JSONEntity implements Serializable {
    @JsonProperty private Map<String, String> extent;
    @JsonProperty private Boolean composedMU;
    @JsonProperty private Map<String, String> measurementSystem;
    @JsonProperty private String nameMU;
    @JsonProperty private Double conversionToStandard;


    public Map<String, String> getExtent() {
        return extent;
    }

    public void setExtent(Map<String, String> extent) {
        this.extent = extent;
    }

    public Boolean getComposedMU() {
        return composedMU;
    }

    public void setComposedMU(Boolean composedMU) {
        this.composedMU = composedMU;
    }

    public Map<String, String> getMeasurementSystem() {
        return measurementSystem;
    }

    public void setMeasurementSystem(Map<String, String> measurementSystem) {
        this.measurementSystem = measurementSystem;
    }

    public String getNameMU() {
        return nameMU;
    }

    public void setNameMU(String nameMU) {
        this.nameMU = nameMU;
    }

    public Double getConversionToStandard() {
        return conversionToStandard;
    }

    public void setConversionToStandard(Double conversionToStandard) {
        this.conversionToStandard = conversionToStandard;
    }
}
