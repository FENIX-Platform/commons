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
    //Internal usage properties
    @JsonProperty private DSDDataset dsd;
    //Properties
    @JsonProperty private String uid;
    @JsonProperty private String version;
    @JsonProperty private OjCodeList language;
    @JsonProperty private Map<String, String> languageDetails;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Date creationDate;
    @JsonProperty private OjCodeList characterSet;
    @JsonProperty private Set<String> parentIdentifiers;
    @JsonProperty private String metadataStandardName;
    @JsonProperty private String metadataStandardVersion;
    @JsonProperty private OjCodeList metadataLanguage;
    @JsonProperty private Collection<OjResponsibleParty> contacts;
    @JsonProperty private String noDataValue;
    //Connected entities
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

    public OjCodeList getLanguages() {
        return language;
    }
    @Embedded
    public void setLanguages(OjCodeList language) {
        this.language = language;
    }

    public Map<String, String> getLanguageDetails() {
        return languageDetails;
    }

    public void setLanguageDetails(Map<String, String> languageDetails) {
        this.languageDetails = languageDetails;
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

    public Set<String> getParentIdentifiers() {
        return parentIdentifiers;
    }

    public void setParentIdentifiers(Set<String> parentIdentifiers) {
        this.parentIdentifiers = parentIdentifiers;
    }

    public String getMetadataStandardName() {
        return metadataStandardName;
    }

    public void setMetadataStandardName(String metadataStandardName) {
        this.metadataStandardName = metadataStandardName;
    }

    public String getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    public void setMetadataStandardVersion(String metadataStandardVersion) {
        this.metadataStandardVersion = metadataStandardVersion;
    }

    public OjCodeList getMetadataLanguage() {
        return metadataLanguage;
    }
    @Embedded
    public void setMetadataLanguage(OjCodeList metadataLanguage) {
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



    //Connected entities
    public MeContent getMeContent() {
        return meContent;
    }
    @Embedded
    public void setMeContent(MeContent meContent) {
        this.meContent = meContent;
    }
}
