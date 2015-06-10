package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.RepresentationType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeContent extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Type of resource",fr="Type de ressource",es="Tipo de recurso")
    @Description(en= "Typology of the resource the metadata refers to. This metadata element determines whether certain meta-data entities are, or are not applicable. For example, the metadata entities 'SpatialRepresentation' and 'ReferenceSystem' are only available for geospatial resource types (e.g. raster; vector).")
    @Order(1)
    @Format(Format.FORMAT.string)
    private RepresentationType resourceRepresentationType;

    @JsonProperty
    @Label(en="Keywords",fr="Mots-clés",es="Palabras clave")
    @Description(en= "Commonly used word(s), formalized word(s) or phrase(s) used to describe the resource.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Collection<String> keywords;

    @JsonProperty
    @Label(en="Abstract",fr="Résumé",es="Resumen")
    @Description(en= "Overview of the main characteristics of the resource and summary of the information contained in the resource, in an easily understandable manner, for technical and non-technical users.")
    @Order(3)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> description;

    @JsonProperty
    @Label(en="Statistical concepts / definitions",fr="Concepts statistiques / définitions",es="Conceptos estadísticos y / o definiciones")
    @Description(en= "Definitions of the statistical concepts under measure (i.e. the statistical domain) and the main variables provided. The considered types of variables (e.g. raw figures, annual growth rates, index, ow or stock data, ...) should be defined and described in accordance with internationally accepted statistical standards, guidelines, or good practices.")
    @Order(4)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> statisticalConceptsDefinitions;

    @JsonProperty
    @Label(en="Reference population",fr="Population de Reference",es="Population Reference")
    @Description(en= "Information about the statistical population the resource refers to.")
    @Order(5)
    @Format(Format.FORMAT.string)
    private SeReferencePopulation seReferencePopulation;

    @JsonProperty
    @Label(en="Coverage",fr="Couverture",es="Cobertura")
    @Description(en= "Size and extent of the resource. The term 'coverage' encompasses the descriptions of key dimensions delimiting the data, e.g. geographical, institutional, product, economic sector,etc., as well as relevant exceptions and exclusions.")
    @Order(6)
    @Format(Format.FORMAT.string)
    private SeCoverage seCoverage;

    @JsonProperty
    @Label(en="Codelist",fr="",es="")
    @Description(en= "This section allows to report information specifically addressed to resources of the kind 'codelist'.")
    @Order(7)
    @Format(Format.FORMAT.string)
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
