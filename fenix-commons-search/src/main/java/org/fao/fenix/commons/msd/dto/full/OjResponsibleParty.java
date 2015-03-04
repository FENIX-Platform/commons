package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class OjResponsibleParty extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String pointOfContact;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> organization;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> organizationUnit;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> position;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private ResponsiblePartyRole role;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> specify;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private OjContact contactInfo;



    public String getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
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
