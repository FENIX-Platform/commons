package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import java.util.Map;

public class OjResponsibleParty extends ResponseHandler {

    public OjResponsibleParty() {}
    public OjResponsibleParty(Object ... source) {
        super(source);
        this.source = source;
    }

    private Object source;

    @JsonProperty
    public String getPointOfContact() {
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
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjContact getContactInfo() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getOrganization() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getOrganizationUnit() {
        return null;
    }



}
