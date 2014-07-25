package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.RepresentationType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeContent extends JSONEntity implements Serializable {

    @JsonProperty private RepresentationType resourceRepresentationType;
    @JsonProperty private Collection<String> keyWords;
    @JsonProperty private Map<String, String> description;

    @JsonProperty private SeReferencePopulation seReferencePopulation;
    @JsonProperty private SeCoverage seCoverage;
    @JsonProperty private SeCodeList seCodeList;


    public RepresentationType getResourceRepresentationType() {
        return resourceRepresentationType;
    }

    public void setResourceRepresentationType(RepresentationType resourceRepresentationType) {
        this.resourceRepresentationType = resourceRepresentationType;
    }

    public Collection<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(Collection<String> keyWords) {
        this.keyWords = keyWords;
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
