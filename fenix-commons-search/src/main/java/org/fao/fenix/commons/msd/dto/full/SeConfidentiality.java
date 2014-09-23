package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeConfidentiality extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> confidentialityPolicy;
    @JsonProperty private Map<String, String> confidentialityDataTreatment;
    @JsonProperty private OjCodeList confidentialityStatus;


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