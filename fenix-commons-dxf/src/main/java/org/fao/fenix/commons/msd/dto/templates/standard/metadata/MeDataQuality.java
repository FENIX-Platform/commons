package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeDataQuality extends ResponseHandler {

    public MeDataQuality() {}
    public MeDataQuality(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getQualityManagement() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getQualityAssessment() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getQualityAssurance() {
        return null;
    }
    @JsonProperty
    public SeAccuracy getSeAccuracy() {
        return null;
    }
    @JsonProperty
    public SeDataRevision getSeDataRevision() {
        return null;
    }
    @JsonProperty
    public SeComparability getSeComparability() {
        return null;
    }
}
