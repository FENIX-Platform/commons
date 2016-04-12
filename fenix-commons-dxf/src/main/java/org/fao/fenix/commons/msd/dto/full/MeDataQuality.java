package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeDataQuality extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Quality management",fr="Gestion de la qualité",es="Gestión de la calidad")
    @Description(en= "Structure, responsibilities and procedures established for guaranteeing the quality of the data.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> qualityManagement;

    @JsonProperty
    @Label(en="Data quality assessment",fr="Évaluation de la qualité des données",es="Evaluación de la calidad de datos")
    @Description(en= "Overall qualitative assessment of the quality of the statistical outputs.")
    @Order(3)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> qualityAssessment;

    @JsonProperty
    @Label(en="Quality assurance",fr="Assurance de la qualité",es="Seguro de calidad")
    @Description(en= "Description of the process assuring that the data production processes conforms to the statistical quality standards.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> qualityAssurance;

    @JsonProperty
    @Label(en="Accuracy",fr="Précision",es="Precisión")
    @Description(en= "Closeness of computations or estimates to the exact values that the statistics were intended to measure. Accuracy can contain either measures of numerical results of the methods for assessing the accuracy of data or qualitative assessment indicators. It may also be described in terms of the major sources of error that potentially cause inaccuracy (e.g. sampling, non-response, response error).")
    @Order(6)
    @Format(Format.FORMAT.string)
    private SeAccuracy seAccuracy;

    @JsonProperty
    @Label(en="Data revision",fr="Révision des données",es="Fecha de revisión")
    @Description(en= "This section describes the policy and practice for identifying the revision status of the data, as well as the availability of revision studies and analysis.")
    @Order(7)
    @Format(Format.FORMAT.string)
    private SeDataRevision seDataRevision;

    @JsonProperty
    @Label(en="Comparability Coherence", fr="Comparabilité, cohérence", es="Comparabilidad y coherencia")
    @Description(en= "Degree of data comparability across the geographic areas or regions referenced by the resource. Data might be derived from surveys that in general are conducted by different statistical agencies. These surveys often refer to populations of different geographical areas, sometimes based on different methodologies.")
    @Order(8)
    @Format(Format.FORMAT.string)
    private SeComparability seComparability;


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

    public SeComparability getSeComparability() {
        return seComparability;
    }
    @Embedded
    public void setSeComparability(SeComparability seComparability) {
        this.seComparability = seComparability;
    }
}
