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
    @Label(en="")
    @Description(en= "")
    private RepresentationType resourceRepresentationType;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Collection<String> keywords;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> description;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> statisticalConceptsDefinitions;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeReferencePopulation seReferencePopulation;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeCoverage seCoverage;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
