package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeClarity extends ResponseHandler {

    public SeClarity() {}
    public SeClarity(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getClarity() {
        return null;
    }
    @JsonProperty
    public Integer getMetadataCompletenessRate() {
        return null;
    }

}
