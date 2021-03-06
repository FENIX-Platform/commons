package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class MeInstitutionalMandate extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Legal acts/agreements",fr="Actes juridiques / accords",es="Actos jurídicos / acuerdos")
    @Description(en= "References (citations or website link) to legal acts or other formal or informal agreements that assign responsibility as well as authority to an agency for the collection, processing, and dissemination of the resource.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Map<String, String> legalActsAgreements;

    @JsonProperty
    @Label(en="Data sharing arrangements",fr="Dispositions pour le partage des données",es="Acuerdos de Datos")
    @Description(en= "References (citations or website link) to arrangements or procedures for data sharing and coordination.")
    @Order(2)
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
