package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeDataQuality extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> qualityManagement;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> qualityAssessment;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> qualityAssurance;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeAccuracy seAccuracy;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDataRevision seDataRevision;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeRelevance seRelevance;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeComparability seComparability;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeTimelinessPunctuality seTimelinessPunctuality;


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
