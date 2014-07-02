package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class MeIdentification extends JSONdto implements Serializable {

    @JsonProperty private String uid;
    @JsonProperty private Collection<OjCodeList> languages;
    @JsonProperty private Map<String, String> languageDetail;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Date creationDate;
    @JsonProperty private OjCodeList characterSet;
    @JsonProperty private Map<String, String> parentsIdentifier;
    @JsonProperty private Map<String, String> metadataStandardName;
    @JsonProperty private Map<String, String> metadataStandardVersion;
    @JsonProperty private Collection<OjCodeList> metadataLanguage;
    @JsonProperty private Collection<OjResponsibleParty> contacts;
    @JsonProperty private String noDataValue;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Collection<OjCodeList> getLanguages() {
        return languages;
    }

    public void setLanguages(Collection<OjCodeList> languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageDetail() {
        return languageDetail;
    }

    public void setLanguageDetail(Map<String, String> languageDetail) {
        this.languageDetail = languageDetail;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public OjCodeList getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(OjCodeList characterSet) {
        this.characterSet = characterSet;
    }

    public Map<String, String> getParentsIdentifier() {
        return parentsIdentifier;
    }

    public void setParentsIdentifier(Map<String, String> parentsIdentifier) {
        this.parentsIdentifier = parentsIdentifier;
    }

    public Map<String, String> getMetadataStandardName() {
        return metadataStandardName;
    }

    public void setMetadataStandardName(Map<String, String> metadataStandardName) {
        this.metadataStandardName = metadataStandardName;
    }

    public Map<String, String> getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    public void setMetadataStandardVersion(Map<String, String> metadataStandardVersion) {
        this.metadataStandardVersion = metadataStandardVersion;
    }

    public Collection<OjCodeList> getMetadataLanguage() {
        return metadataLanguage;
    }

    public void setMetadataLanguage(Collection<OjCodeList> metadataLanguage) {
        this.metadataLanguage = metadataLanguage;
    }

    public Collection<OjResponsibleParty> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<OjResponsibleParty> contacts) {
        this.contacts = contacts;
    }

    public String getNoDataValue() {
        return noDataValue;
    }

    public void setNoDataValue(String noDataValue) {
        this.noDataValue = noDataValue;
    }
}
