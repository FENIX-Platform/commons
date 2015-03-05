package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.RepresentationType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeContent extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Type of resource")
    @Description(en= "Typology of the resource the metadata refers to. This metadata element determines whether certain meta-data entities are, or are not applicable. For example, the metadata entities 'SpatialRepresentation' and 'ReferenceSystem' are only available for geospatial resource types (e.g. raster; vector).")
private RepresentationType resourceRepresentationType;

    @JsonProperty
    @Label(en="Keywords")
    @Description(en= "Commonly used word(s), formalized word(s) or phrase(s) used to describe the resource.")
    private Collection<String> keywords;

    @JsonProperty
    @Label(en="Description")
    @Description(en= "Overview of the main characteristics of the resource and summary of the information contained in the resource, in an easily understandable manner, for technical and non-technical users.")
    private Map<String, String> description;

    @JsonProperty
    @Label(en="Statistical concepts / definitions")
    @Description(en= "Definitions of the statistical concepts under measure (i.e. the statistical domain) and the main variables provided. The considered types of variables (e.g. raw figures, annual growth rates, index, ow or stock data, ...) should be dened and described in accordance with internationally accepted statistical standards, guidelines, or good practices.")
    private Map<String, String> statisticalConceptsDefinitions;

    @JsonProperty
    @Label(en="Reference population")
    @Description(en= "Information about the statistical population the resource refers to.")
    private SeReferencePopulation seReferencePopulation;

    @JsonProperty
    @Label(en="Coverage")
    @Description(en= "Size and extent of the resource. The term 'coverage' encompasses the descriptions of key dimensions delimiting the data, e.g. geographical, institutional, product, economic sector,etc., as well as relevant exceptions and exclusions.")
    private SeCoverage seCoverage;

    @JsonProperty
    @Label(en="Codelist")
    @Description(en= "this section allows to report information specifically addressed to resources of the kind 'codelist'.")
    private SeCodeList seCodeList;


    public RepresentationType getResourceRepresentationType() {
        return resourceRepresentationType;
    }

    public void setResourceRepresentationType(RepresentationType resourceRepresentationType) {
        this.resourceRepresentationType = resourceRepresentationType;
    }

    public Collection<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Collection<String> keywords) {
        this.keywords = keywords;
    }

    public Map<String, String> getStatisticalConceptsDefinitions() {
        return statisticalConceptsDefinitions;
    }

    public void setStatisticalConceptsDefinitions(Map<String, String> statisticalConceptsDefinitions) {
        this.statisticalConceptsDefinitions = statisticalConceptsDefinitions;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public SeReferencePopulation getSeReferencePopulation() {
        return seReferencePopulation;
    }
    @Embedded
    public void setSeReferencePopulation(SeReferencePopulation seReferencePopulation) {
        this.seReferencePopulation = seReferencePopulation;
    }

    public SeCoverage getSeCoverage() {
        return seCoverage;
    }
    @Embedded
    public void setSeCoverage(SeCoverage seCoverage) {
        this.seCoverage = seCoverage;
    }

    public SeCodeList getSeCodeList() {
        return seCodeList;
    }
    @Embedded
    public void setSeCodeList(SeCodeList seCodeList) {
        this.seCodeList = seCodeList;
    }
}
