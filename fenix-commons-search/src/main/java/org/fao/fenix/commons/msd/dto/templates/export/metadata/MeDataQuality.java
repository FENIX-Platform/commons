package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeDataQuality extends ResponseHandler {

    public MeDataQuality() {}
    public MeDataQuality(Object source) {
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
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeAccuracy getSeAccuracy() {
        return null;
    }
    @JsonProperty
    public SeDataRevision getSeDataRevision() {
        return null;
    }
    @JsonProperty
    public SeRelevance getSeRelevance() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeComparability getSeComparability() {
        return null;
    }
    @JsonProperty
    public SeTimelinessPunctuality getSeTimelinessPunctuality() {
        return null;
    }
}
