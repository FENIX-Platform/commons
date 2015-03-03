package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeConfidentiality extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> confidentialityPolicy;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> confidentialityDataTreatment;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
