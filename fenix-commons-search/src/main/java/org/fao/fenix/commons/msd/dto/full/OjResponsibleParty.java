package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class OjResponsibleParty extends JSONEntity implements Serializable {

    @JsonProperty private String name;
    @JsonProperty private Map<String, String> organization;
    @JsonProperty private Map<String, String> organizationUnit;
    @JsonProperty private Map<String, String> position;
    @JsonProperty private ResponsiblePartyRole role;
    @JsonProperty private Map<String, String> specify;
    @JsonProperty private OjContact contactInfo;



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
    @Embedded
    public void setContactInfo(OjContact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Map<String, String> getOrganization() {
        return organization;
    }

    public void setOrganization(Map<String, String> organization) {
        this.organization = organization;
    }

    public Map<String, String> getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(Map<String, String> organizationUnit) {
        this.organizationUnit = organizationUnit;
    }
}
