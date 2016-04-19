package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class OjMeasure extends ResponseHandler {

    public OjMeasure() {}
    public OjMeasure(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getExtent() {
        return null;
    }
    @JsonProperty
    public Boolean getComposedMU() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getMeasurementSystem() {
        return null;
    }
    @JsonProperty
    public String getNameMU() {
        return null;
    }
    @JsonProperty
    public Double getConversionToStandard() {
        return null;
    }

}
