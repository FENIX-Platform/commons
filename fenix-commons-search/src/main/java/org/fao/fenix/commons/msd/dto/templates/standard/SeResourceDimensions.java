package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    public Map<String,String> getDimensionTypeLabel() {
        DimensionType value = getDimensionType();
        return value!=null ? value.getLabel() : null;
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
