package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;

import java.io.Serializable;
import java.util.Map;

public class OjCodeList extends JSONdto implements Serializable {
    @JsonProperty private Code linkedSource;
    @JsonProperty private String codeList;
    @JsonProperty private String version;
    @JsonProperty private String code;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private OjResponsibleParty contactInfo;
    @JsonProperty private String link;


    public Code getLinkedSource() {
        return linkedSource;
    }

    public void setLinkedSource(Code linkedSource) {
        this.linkedSource = linkedSource;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public void setContactInfo(OjResponsibleParty contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
