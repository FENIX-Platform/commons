package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;

public abstract class MeIdentification extends JSONEntity implements Serializable {
    //Properties
    @JsonProperty private String uid;
    @JsonProperty private String version;
    @JsonProperty private Collection<String> parentIdentifiers;
    @JsonProperty private OjCodeList language;
    @JsonProperty private Map<String, String> languageDetails;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Date creationDate;
    @JsonProperty private OjCodeList characterSet;
    @JsonProperty private String metadataStandardName;
    @JsonProperty private String metadataStandardVersion;
    @JsonProperty private OjCodeList metadataLanguage;
    @JsonProperty private Collection<OjResponsibleParty> contacts;
    @JsonProperty private String noDataValue;
    //Connected entities
    @JsonProperty private Collection<MeDocuments> meDocuments;
    @JsonProperty private MeInstitutionalMandate meInstitutionalMandate;
    @JsonProperty private MeAccessibility meAccessibility;
    @JsonProperty private MeContent meContent;
    @JsonProperty private MeDataQuality meDataQuality;
    @JsonProperty private MeMaintenance meMaintenance;
    @JsonProperty private MeReferenceSystem meReferenceSystem;
    @JsonProperty private MeResourceStructure meResourceStructure;
    @JsonProperty private MeSpatialRepresentation meSpatialRepresentation;
    @JsonProperty private MeStatisticalProcessing meStatisticalProcessing;

    public abstract DSD getDsd();

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

    public OjCodeList getLanguage() {
        return language;
    }
    @Embedded
    public void setLanguage(OjCodeList language) {
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

    public Collection<String> getParentIdentifiers() {
        return parentIdentifiers;
    }

    public void setParentIdentifiers(Collection<String> parentIdentifiers) {
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

    public Collection<MeDocuments> getMeDocuments() {
        return meDocuments;
    }
    @Embedded
    public void setMeDocuments(Collection<MeDocuments> meDocuments) {
        this.meDocuments = meDocuments;
    }

    public MeInstitutionalMandate getMeInstitutionalMandate() {
        return meInstitutionalMandate;
    }
    @Embedded
    public void setMeInstitutionalMandate(MeInstitutionalMandate meInstitutionalMandate) {
        this.meInstitutionalMandate = meInstitutionalMandate;
    }

    public MeAccessibility getMeAccessibility() {
        return meAccessibility;
    }
    @Embedded
    public void setMeAccessibility(MeAccessibility meAccessibility) {
        this.meAccessibility = meAccessibility;
    }

    public MeDataQuality getMeDataQuality() {
        return meDataQuality;
    }
    @Embedded
    public void setMeDataQuality(MeDataQuality meDataQuality) {
        this.meDataQuality = meDataQuality;
    }

    public MeMaintenance getMeMaintenance() {
        return meMaintenance;
    }
    @Embedded
    public void setMeMaintenance(MeMaintenance meMaintenance) {
        this.meMaintenance = meMaintenance;
    }

    public MeReferenceSystem getMeReferenceSystem() {
        return meReferenceSystem;
    }
    @Embedded
    public void setMeReferenceSystem(MeReferenceSystem meReferenceSystem) {
        this.meReferenceSystem = meReferenceSystem;
    }

    public MeResourceStructure getMeResourceStructure() {
        return meResourceStructure;
    }
    @Embedded
    public void setMeResourceStructure(MeResourceStructure meResourceStructure) {
        this.meResourceStructure = meResourceStructure;
    }

    public MeSpatialRepresentation getMeSpatialRepresentation() {
        return meSpatialRepresentation;
    }
    @Embedded
    public void setMeSpatialRepresentation(MeSpatialRepresentation meSpatialRepresentation) {
        this.meSpatialRepresentation = meSpatialRepresentation;
    }

    public MeStatisticalProcessing getMeStatisticalProcessing() {
        return meStatisticalProcessing;
    }
    @Embedded
    public void setMeStatisticalProcessing(MeStatisticalProcessing meStatisticalProcessing) {
        this.meStatisticalProcessing = meStatisticalProcessing;
    }



    //Utils
    public boolean isIdentificationOnly() throws IllegalAccessException {
        for (Field field : this.getClass().getDeclaredFields()) {
            String fieldName = field.getName();
            Object fieldValue = field.get(this);
            if (!fieldName.equals("uid") && !fieldName.equals("version") && fieldValue!=null) {
                if (fieldValue instanceof Collection) {
                    if (((Collection)fieldValue).size()>0)
                        return false;
                } else if (fieldValue instanceof Map) {
                    if (((Map)fieldValue).size()>0)
                        return false;
                } else
                    return false;
            }
        }
        return true;
    }


}
