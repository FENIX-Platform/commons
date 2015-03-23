package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeInstitutionalMandate extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Legal acts/agreements")
    @Description(en= "References (citations or website link) to legal acts or other formal or informal agreements that assign responsibility as well as authority to an agency for the collection, processing, and dissemination of the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> legalActsAgreements;

    @JsonProperty
    @Label(en="Data sharing arrangements")
    @Description(en= "References (citations or website link) to arrangements or procedures for data sharing and coordination.")
    @Order(-1)
    @Format(Format.FORMAT.string)
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
