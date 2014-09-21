package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeDataQuality extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> qualityManagement;
    @JsonProperty private Map<String, String> qualityAssessment;
    @JsonProperty private Map<String, String> qualityAssurance;

    @JsonProperty private SeAccuracy seAccuracy;
    @JsonProperty private SeDataRevision seDataRevision;
    @JsonProperty private SeRelevance seRelevance;
    @JsonProperty private SeComparability seComparability;
    @JsonProperty private SeTimelinessPunctuality seTimelinessPunctuality;


    public Map<String, String> getQualityManagement() {
        return qualityManagement;
    }

    public void setQualityManagement(Map<String, String> qualityManagement) {
        this.qualityManagement = qualityManagement;
    }

    public Map<String, String> getQualityAssessment() {
        return qualityAssessment;
    }

    public void setQualityAssessment(Map<String, String> qualityAssessment) {
        this.qualityAssessment = qualityAssessment;
    }

    public Map<String, String> getQualityAssurance() {
        return qualityAssurance;
    }

    public void setQualityAssurance(Map<String, String> qualityAssurance) {
        this.qualityAssurance = qualityAssurance;
    }

    public SeAccuracy getSeAccuracy() {
        return seAccuracy;
    }
    @Embedded
    public void setSeAccuracy(SeAccuracy seAccuracy) {
        this.seAccuracy = seAccuracy;
    }

    public SeDataRevision getSeDataRevision() {
        return seDataRevision;
    }
    @Embedded
    public void setSeDataRevision(SeDataRevision seDataRevision) {
        this.seDataRevision = seDataRevision;
    }

    public SeRelevance getSeRelevance() {
        return seRelevance;
    }
    @Embedded
    public void setSeRelevance(SeRelevance seRelevance) {
        this.seRelevance = seRelevance;
    }

    public SeComparability getSeComparability() {
        return seComparability;
    }
    @Embedded
    public void setSeComparability(SeComparability seComparability) {
        this.seComparability = seComparability;
    }

    public SeTimelinessPunctuality getSeTimelinessPunctuality() {
        return seTimelinessPunctuality;
    }
    @Embedded
    public void setSeTimelinessPunctuality(SeTimelinessPunctuality seTimelinessPunctuality) {
        this.seTimelinessPunctuality = seTimelinessPunctuality;
    }
}
