package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeInstitutionalMandate extends ResponseHandler {

    public MeInstitutionalMandate() {}
    public MeInstitutionalMandate(Object source) {
        super(source);
    }

    @JsonProperty
    public Map<String, String> getLegalActsAgreements() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getInstitutionalMandateDataSharing() {
        return null;
    }

}
