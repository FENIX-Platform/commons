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
    @Label(en="Quality management")
    @Description(en= "Structure, responsibilities and procedures established for guaranteeing the quality of the data.")
    private Map<String, String> qualityManagement;

    @JsonProperty
    @Label(en="Data quality assessment")
    @Description(en= "Overall qualitative assessment of the quality of the statistical outputs.")
    private Map<String, String> qualityAssessment;

    @JsonProperty
    @Label(en="Quality assurance")
    @Description(en= "Description of the process assuring that the data production processes conforms to the statistical quality standards.")
    private Map<String, String> qualityAssurance;

    @JsonProperty
    @Label(en="ACCURACY")
    @Description(en= "Closeness of computations or estimates to the exact values that the statistics were intended to measure. Accuracy can contain either measures of numerical results of the methods for assessing the accuracy of data or qualitative assessment indicators. It may also be described in terms of the major sources of error that potentially cause inaccuracy (e.g. sampling, non-response, response error).")
    private SeAccuracy seAccuracy;

    @JsonProperty
    @Label(en="Data revision")
    @Description(en= "This section describes the policy and practice for identifying the revision status of the data, as well as the availability of revision studies and analysis.")
    private SeDataRevision seDataRevision;

    @JsonProperty
    @Label(en="Relevance")
    @Description(en= "Evaluation of data-quality through user satisfaction involving also information about the resource-completeness.")
    private SeRelevance seRelevance;

    @JsonProperty
    @Label(en="Comparability Coherence")
    @Description(en= "Degree of data comparability across the geographic areas or regions referenced by the resource. Data might be derived from surveys that in general are conducted by dierent statistical agencies. These surveys often refer to populations of different geographical areas, sometimes based on different methodologies.")
    private SeComparability seComparability;

    @JsonProperty
    @Label(en="Timeliness and Punctuality")
    @Description(en= "Evaluation of the timeliness of the resource dissemination with respect to the phenomenon it describes. In addition this section take in to account the punctuality of data dissemination.")
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
