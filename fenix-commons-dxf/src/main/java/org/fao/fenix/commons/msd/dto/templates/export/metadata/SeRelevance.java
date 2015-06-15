package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeRelevance extends ResponseHandler {

    public SeRelevance() {}
    public SeRelevance(Object source) {
        super(source);
    }



    @JsonProperty
    public Map<String, String> getUserNeeds() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getUserSatisfaction() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getCompleteness() {
        return null;
    }
    @JsonProperty
    public Double getCompletenessPercentage() {
        return null;
    }

}
