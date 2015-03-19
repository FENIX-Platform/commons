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
    @Label(en="Point of contact")
    @Description(en="Responsible person-surname, given name, title separated by a delimiter. It contains information about the party who can be contacted for acquiring knowledge the resource.")
    private String pointOfContact;

    @JsonProperty
    @Label(en="Organization")
    @Description(en="Name of the responsible organization.")
    private Map<String, String> organization;

    @JsonProperty
    @Label(en="Organization unit/division")
    @Description(en="Addressable subdivision of an organization.")
    private Map<String, String> organizationUnit;

    @JsonProperty
    @Label(en="Position")
    @Description(en="Role or position of the responsible person.")
    private Map<String, String> position;

    @JsonProperty
    @Label(en="Role")
    @Description(en="Function performed by the responsible party concerning the resource (e.g. owner, distributor, user. . . )")
    private ResponsiblePartyRole role;

    @JsonProperty
    @Label(en="Specify")
    @Description(en="Textual metadata element that allows to specify the role performed by the responsible party. This field is conditional to the element <role>.")
    private Map<String, String> specify;

    @JsonProperty
    @Label(en="Contact information")
    @Description(en="Address/phone number/email of the responsible party.")
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
