package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Subject;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;

public class MeIdentification <T extends DSD> extends JSONEntity implements Serializable {

    /* Properties */

    @JsonProperty
    @Label(en="Resource identification code")
    @Description(en="Resource identifier. It is a code that creates the match between the resource and the metadata it is associated to.")
    private String uid;

    @JsonProperty
    @Label(en="Version")
    @Description(en="This is the version of the metadata.")
    private String version;

    @JsonProperty
    @Label(en="Parent(s) metadata ID")
    @Description(en= "Identifier of the metadata record to which this metadata record is a subset of (i.e. parent metadata of hierarchical metadata records). The specification of the parentIdentifier allows to inherit a set of metadata information from the parent metadata record. The choice of which metadata elements must to be kept from the parent record and the one that has to be manually modified, it is subject to ad hoc controls.")
    private Collection<String> parentIdentifiers;

    @JsonProperty
    @Label(en="Language(s)")
    @Description(en= "Language used by the resource for textual information.")
    private OjCodeList language;

    @JsonProperty
    @Label(en="Language details")
    @Description(en= "Comments and additional details about the language used for the textual information of the resource. This field is addressed to highlight some particular inconsistencies in the language (or languages) used in the resource, if any. For example to alert that the resource is not completely homogeneous in the language used for textual information. Otherwise it can be leaved empty.")
    private Map<String, String> languageDetails;

    @JsonProperty
    @Label(en="Title")
    @Description(en= "Textual label used as title of the resource.")
    private Map<String, String> title;

    @JsonProperty
    @Label(en="Creation date")
    @Description(en= "Creation date of the resource.")
    private Date creationDate;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList characterSet;

    @JsonProperty
    @Label(en="Character-set")
    @Description(en= "Full name of the character coding standard used by the resource.")
    private String metadataStandardName;

    @JsonProperty
    @Label(en="Used metadata standard")
    @Description(en= "Name of the metadata standard specifications used. In FENIX framework this field would be pre-compiled by 'FENIX'.")
    private String metadataStandardVersion;

    @JsonProperty
    @Label(en="Version of metadata standard")
    @Description(en= "Version of the metadata standard specifications used.")
    private OjCodeList metadataLanguage;

    @JsonProperty
    @Label(en="Contact(s)")
    @Description(en= "Responsible party that could be identify as the data source. FENIX metadata contains more than one field of the type 'ResponsibleParty' addressed to report all the information necessary to contact party(ies) playing different roles in respect to the resource. In particular this field (belonging to the Identification entity) should report the party who owns authority on the resource.")
    private Collection<OjResponsibleParty> contacts;

    @JsonProperty
    @Label(en="Value assigned to No-data")
    @Description(en= "Value assigned to the cells to represent the absence of data. Missing values are usually highlight through apposite ags, however the data matrix does not report empty cells but a predened combination of characters (such as 'NA', '000' . . . ) indicating the absence of data.")
    private String noDataValue;

    /* Connected entities */

    @JsonProperty
    @Label(en="DOCUMENTS")
    @Description(en= "This section allows linking publications, news, or other relevant material to the considered resource.")
    private Collection<MeDocuments> meDocuments;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeInstitutionalMandate meInstitutionalMandate;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeAccessibility meAccessibility;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeContent meContent;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeDataQuality meDataQuality;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeMaintenance meMaintenance;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeReferenceSystem meReferenceSystem;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeResourceStructure meResourceStructure;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeSpatialRepresentation meSpatialRepresentation;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private MeStatisticalProcessing meStatisticalProcessing;

    /* DSD */
    @JsonProperty private T dsd;



    //GET - SET
    public T getDsd() {
        return dsd;
    }
    public void setDsd(T dsd) {
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
        for (Field field : MeIdentification.class.getDeclaredFields()) {
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
