package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeDataValidation extends ResponseHandler {

    public SeDataValidation() {}
    public SeDataValidation(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getDataValidationIntermediate() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataValidationOutput() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataValidationSource() {
        return null;
    }

}
