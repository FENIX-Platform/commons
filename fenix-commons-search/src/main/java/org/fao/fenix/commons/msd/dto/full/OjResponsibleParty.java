package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ResponsiblePartyRole;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class OjResponsibleParty extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Point of contact", fr="Point de contact", es="Punto de contacto")
    @Description(en="Responsible person-surname, given name, title separated by a delimiter. It contains information about the party who can be contacted for acquiring knowledge the resource.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private String pointOfContact;

    @JsonProperty
    @Label(en="Organization", fr="Organisation", es="Organización")
    @Description(en="Name of the responsible organization.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Map<String, String> organization;

    @JsonProperty
    @Label(en="Organization unit/division", fr="Unité/division dans l'organisation", es="Unidad/división de organización")
    @Description(en="Addressable subdivision of an organization.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> organizationUnit;

    @JsonProperty
    @Label(en="Position", fr="Position", es="Posición")
    @Description(en="Role or position of the responsible person.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private Map<String, String> position;

    @JsonProperty
    @Label(en="Role", fr="Rôle", es="Función/rol")
    @Description(en="Function performed by the responsible party concerning the resource (e.g. owner, distributor, user. . . )")
    @Order(5)
    @Format(Format.FORMAT.string)
    private ResponsiblePartyRole role;

    @JsonProperty
    @Label(en="Specify", fr="Spécifier", es="Especificar")
    @Description(en="Textual metadata element that allows to specify the role performed by the responsible party. This field is conditional to the element <role>.")
    @Order(6)
    @Format(Format.FORMAT.string)
    private Map<String, String> specify;

    @JsonProperty
    @Label(en="Contact information", fr="Contact", es="Contacto")
    @Description(en="Address/phone number/email of the responsible party.")
    @Order(7)
    @Format(Format.FORMAT.string)
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
