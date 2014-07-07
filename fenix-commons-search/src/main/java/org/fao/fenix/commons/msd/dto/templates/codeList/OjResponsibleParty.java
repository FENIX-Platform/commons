package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import java.util.Map;

public class OjResponsibleParty extends ResponseHandler {

    public OjResponsibleParty() {}
    public OjResponsibleParty(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getOrganisation() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getOrganisationUnit() {
        return null;
    }
    @JsonProperty
    public String getName() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getPosition() {
        return null;
    }
    @JsonProperty
    public ResponsiblePartyRole getRole() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getSpecify() {
        return null;
    }
    @JsonProperty
    public OjContact getContactInfo() {
        return null;
    }
}
