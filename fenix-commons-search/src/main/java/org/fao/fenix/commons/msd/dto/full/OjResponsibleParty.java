package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class OjResponsibleParty extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> organisation;
    @JsonProperty private Map<String, String> organisationUnit;
    @JsonProperty private String name;
    @JsonProperty private Map<String, String> position;
    @JsonProperty private ResponsiblePartyRole role;
    @JsonProperty private Map<String, String> specify;
    @JsonProperty @Embedded private OjContact contactInfo;


    public Map<String, String> getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Map<String, String> organisation) {
        this.organisation = organisation;
    }

    public Map<String, String> getOrganisationUnit() {
        return organisationUnit;
    }

    public void setOrganisationUnit(Map<String, String> organisationUnit) {
        this.organisationUnit = organisationUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getPosition() {
        return position;
    }

    public void setPosition(Map<String, String> position) {
        this.position = position;
    }

    public ResponsiblePartyRole getRole() {
        return role;
    }

    public void setRole(ResponsiblePartyRole role) {
        this.role = role;
    }

    public Map<String, String> getSpecify() {
        return specify;
    }

    public void setSpecify(Map<String, String> specify) {
        this.specify = specify;
    }

    public OjContact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(OjContact contactInfo) {
        this.contactInfo = contactInfo;
    }
}
