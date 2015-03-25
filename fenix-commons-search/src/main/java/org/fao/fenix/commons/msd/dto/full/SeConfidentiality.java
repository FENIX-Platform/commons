package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeConfidentiality extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Confidentiality - Policy")
    @Description(en= "Legislative measures or other formal procedures which prevent unauthorized disclosure of data that identify a person or economic entity either directly or indirectly. It consists in textual description and references to legislation or other rules related to statistical confidentiality.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> confidentialityPolicy;

    @JsonProperty
    @Label(en="Confidentiality - Data treatment")
    @Description(en= "Rules applied for treating the resource to ensure confidentiality and prevent unauthorized disclosure.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> confidentialityDataTreatment;

    @JsonProperty
    @Label(en="Status of confidentiality")
    @Description(en= "Coded information describing the degree of confidentiality of the resource.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private OjCodeList confidentialityStatus;


    public Map<String, String> getConfidentialityPolicy() {
        return confidentialityPolicy;
    }

    public void setConfidentialityPolicy(Map<String, String> confidentialityPolicy) {
        this.confidentialityPolicy = confidentialityPolicy;
    }

    public Map<String, String> getConfidentialityDataTreatment() {
        return confidentialityDataTreatment;
    }

    public void setConfidentialityDataTreatment(Map<String, String> confidentialityDataTreatment) {
        this.confidentialityDataTreatment = confidentialityDataTreatment;
    }

    public OjCodeList getConfidentialityStatus() {
        return confidentialityStatus;
    }
    @Embedded
    public void setConfidentialityStatus(OjCodeList confidentialityStatus) {
        this.confidentialityStatus = confidentialityStatus;
    }
}
