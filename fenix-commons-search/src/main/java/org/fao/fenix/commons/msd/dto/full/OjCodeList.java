package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class OjCodeList extends JSONEntity implements Serializable {
    private MeIdentification linkedCodeList;

    @JsonProperty
    @Label(en="Code(s)")
    @Description(en="Code corresponding to the element requested by the field it refers to.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Collection<OjCode> codes;

    @JsonProperty
    @Label(en="Codelist identification")
    @Description(en="Codelist identifier. It is an alphanumeric acronyme that identify the codelist.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String idCodeList;

    @JsonProperty
    @Label(en="Version of the codelist")
    @Description(en="Information about the version and the state of upgrade of the code list used.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String version;

    @JsonProperty
    @Label(en="Extended name")
    @Description(en="Full name of the codelist.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> extendedName;

    @JsonProperty
    @Label(en="Contact(s)")
    @Description(en="Individual/organizational contact points for a code list including information about the person(s)/maintenance agency and how to reach the contact points.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjResponsibleParty contactInfo;

    @JsonProperty
    @Label(en="Resource(s) linked to the codelist")
    @Description(en="It allows to attach documents to the codelist or simply to cite a webpage linked to the code list to which it refers to.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Collection<OjCitation> codeListResources;

    @JsonProperty
    @Label(en="Codelist hyperlink")
    @Description(en="Web site link allowing the user access to the information resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String link;


    public String getIdCodeList() {
        return idCodeList;
    }

    public void setIdCodeList(String idCodeList) {
        this.idCodeList = idCodeList;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Collection<OjCode> getCodes() {
        return codes;
    }
    @Embedded
    public void setCodes(Collection<OjCode> codes) {
        this.codes = codes;
    }

    public Map<String, String> getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(Map<String, String> extendedName) {
        this.extendedName = extendedName;
    }

    public OjResponsibleParty getContactInfo() {
        return contactInfo;
    }
    @Embedded
    public void setContactInfo(OjResponsibleParty contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MeIdentification getLinkedCodeList() {
        return linkedCodeList;
    }

    public void setLinkedCodeList(MeIdentification linkedCodeList) {
        this.linkedCodeList = linkedCodeList;
    }

    public Collection<OjCitation> getCodeListResources() {
        return codeListResources;
    }
    @Embedded
    public void setCodeListResources(Collection<OjCitation> codeListResources) {
        this.codeListResources = codeListResources;
    }
}
