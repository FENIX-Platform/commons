package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class MeIdentification extends JSONEntity implements Serializable {

    @JsonProperty private DSDDataset dsd;

    @JsonProperty private String uid;
    @JsonProperty private String version;
    @JsonProperty private Set<String> parentsIdentifier;
    @JsonProperty private Collection<OjCodeList> languages;
    @JsonProperty private Map<String, String> languageDetail;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Date creationDate;
    @JsonProperty private OjCodeList characterSet;
    @JsonProperty private Map<String, String> metadataStandardName;
    @JsonProperty private Map<String, String> metadataStandardVersion;
    @JsonProperty private Collection<OjCodeList> metadataLanguage;
    @JsonProperty private Collection<OjResponsibleParty> contacts;
    @JsonProperty private String noDataValue;

    @JsonProperty private MeContent meContent;


    public DSDDataset getDsd() {
        return dsd;
    }

    public void setDsd(DSDDataset dsd) {
        this.dsd = dsd;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Collection<OjCodeList> getLanguages() {
        return languages;
    }
    @Embedded
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
    @Embedded
    public void setCharacterSet(OjCodeList characterSet) {
        this.characterSet = characterSet;
    }

    public Set<String> getParentsIdentifier() {
        return parentsIdentifier;
    }

    public void setParentsIdentifier(Set<String> parentsIdentifier) {
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
    @Embedded
    public void setMetadataLanguage(Collection<OjCodeList> metadataLanguage) {
        this.metadataLanguage = metadataLanguage;
    }

    public Collection<OjResponsibleParty> getContacts() {
        return contacts;
    }
    @Embedded
    public void setContacts(Collection<OjResponsibleParty> contacts) {
        this.contacts = contacts;
    }

    public String getNoDataValue() {
        return noDataValue;
    }

    public void setNoDataValue(String noDataValue) {
        this.noDataValue = noDataValue;
    }

    public MeContent getMeContent() {
        return meContent;
    }
    @Embedded
    public void setMeContent(MeContent meContent) {
        this.meContent = meContent;
    }
}
