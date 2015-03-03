package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeInstitutionalMandate extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> legalActsAgreements;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> institutionalMandateDataSharing;

    public Map<String, String> getLegalActsAgreements() {
        return legalActsAgreements;
    }

    public void setLegalActsAgreements(Map<String, String> legalActsAgreements) {
        this.legalActsAgreements = legalActsAgreements;
    }

    public Map<String, String> getInstitutionalMandateDataSharing() {
        return institutionalMandateDataSharing;
    }

    public void setInstitutionalMandateDataSharing(Map<String, String> institutionalMandateDataSharing) {
        this.institutionalMandateDataSharing = institutionalMandateDataSharing;
    }
}
