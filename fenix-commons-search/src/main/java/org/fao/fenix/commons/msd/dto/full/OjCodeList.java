package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class OjCodeList extends JSONEntity implements Serializable {
    @JsonProperty private Collection<Code> linkedCodes;
    @JsonProperty private String codeList;
    @JsonProperty private String version;
    @JsonProperty private Collection<OjCode> codes;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private OjResponsibleParty contactInfo;
    @JsonProperty private String link;


    public String getCodeList() {
        return codeList;
    }

    public void setCodeList(String codeList) {
        this.codeList = codeList;
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

    public void setCodes(Collection<OjCode> codes) {
        this.codes = codes;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
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

    public Collection<Code> getLinkedCodes() {
        return linkedCodes;
    }

    public void setLinkedCodes(Collection<Code> linkedCodes) {
        this.linkedCodes = linkedCodes;
    }
}
