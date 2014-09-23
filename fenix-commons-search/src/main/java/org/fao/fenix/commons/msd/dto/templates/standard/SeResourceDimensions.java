package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.DimensionType;

import java.util.Map;

public class SeResourceDimensions extends ResponseHandler {

    public SeResourceDimensions() {}
    public SeResourceDimensions(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getDimensionName() {
        return null;
    }
    @JsonProperty
    public DimensionType getDimensionType() {
        return null;
    }
    @JsonProperty
    public OjCodeList getDimensionSubject() {
        return null;
    }
    @JsonProperty
    public Object getDimensionContent() {
        return null;
    }
    @JsonProperty
    public OjMeasure getDimensionMU() {
        return null;
    }

}