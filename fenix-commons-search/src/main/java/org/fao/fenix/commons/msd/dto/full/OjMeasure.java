package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class OjMeasure extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Extent")
    @Description(en="Description of the type of magnitude has been measured (e.g. a length, an area, a volume).")
    private Map<String, String> extent;

    @JsonProperty
    @Label(en="Composed unit of measurement")
    @Description(en="Since a wide variety of phenomenon is measured combining several simple unit of measure, it is requested a Boolean element indicating whether simple or composed unit of measure is used.")
    private Boolean composedMU;

    @JsonProperty
    @Label(en="Measurement system")
    @Description(en="System devised to measure some physical quantity (such distance or area. . . ). Example are the English System of feet and inches or the metric system of millimetres, centimetres and meters, also the International System of Units (SI).")
    private Map<String, String> measurementSystem;

    @JsonProperty
    @Label(en="Measurement unit name")
    @Description(en="Name of the simple/composed unit of measure adopted.")
    private String nameMU;

    @JsonProperty
    @Label(en="Conversion to the standard")
    @Description(en="Allows to convert the unit of measure used in a standard measurement system.")
    private Double conversionToStandard;


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
