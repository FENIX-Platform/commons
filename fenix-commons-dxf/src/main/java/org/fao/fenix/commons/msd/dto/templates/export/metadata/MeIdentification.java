package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class MeIdentification extends ResponseHandler {
    private Collection<MeIdentification> children;

    public MeIdentification() {}
    public MeIdentification(Object ... source) {
        super(source);
    }


    //Exclude RID informations
    @Override
    @JsonIgnore
    public String getRID() {
        return null;
    }


    @JsonProperty
    public String getUid() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }
    @JsonProperty
    public OjCodeList getLanguage() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getLanguageDetails() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Date getCreationDate() {
        return null;
    }
    @JsonProperty
    public OjCodeList getCharacterSet() {
        return null;
    }
    @JsonProperty
    public String getMetadataStandardName() {
        return null;
    }
    @JsonProperty
    public String getMetadataStandardVersion() {
        return null;
    }
    @JsonProperty
    public OjCodeList getMetadataLanguage() {
        return null;
    }
    @JsonProperty
    public Collection<OjResponsibleParty> getContacts() {
        return null;
    }
    @JsonProperty
    public String getNoDataValue() {
        return null;
    }
    //Hierarchy
    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.identification.MeIdentification> getParents() {
        return null;
    }
    @JsonProperty
    public Collection<MeIdentification> getChildren() {
        return children;
    }
    @JsonProperty
    public void setChildren(Collection<MeIdentification> children) {
        this.children = children;
    }


    //Connected entities
    @JsonProperty
    public MeContent getMeContent() {
        return null;
    }
    @JsonProperty
    public Collection<MeDocuments> getMeDocuments() {
        return null;
    }
    @JsonProperty
    public MeInstitutionalMandate getMeInstitutionalMandate() {
        return null;
    }
    @JsonProperty
    public MeAccessibility getMeAccessibility() {
        return null;
    }
    @JsonProperty
    public MeDataQuality getMeDataQuality() {
        return null;
    }
    @JsonProperty
    public MeMaintenance getMeMaintenance() {
        return null;
    }
    @JsonProperty
    public MeReferenceSystem getMeReferenceSystem() {
        return null;
    }
    @JsonProperty
    public MeResourceStructure getMeResourceStructure() {
        return null;
    }
    @JsonProperty
    public MeSpatialRepresentation getMeSpatialRepresentation() {
        return null;
    }
    @JsonProperty
    public MeStatisticalProcessing getMeStatisticalProcessing() {
        return null;
    }

}
