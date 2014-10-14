package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.RepresentationType;

import java.util.Collection;
import java.util.Map;

public class MeContent extends ResponseHandler {

    public MeContent() {}
    public MeContent(Object source) {
        super(source);
    }


    @JsonProperty
    public RepresentationType getResourceRepresentationType() {
        return null;
    }
    @JsonProperty
    public Collection<String> getKeywords() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getStatisticalConceptsDefinitions() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDescription() {
        return null;
    }
    @JsonProperty
    public SeReferencePopulation getSeReferencePopulation() {
        return null;
    }
    @JsonProperty
    public SeCoverage getSeCoverage() {
        return null;
    }
    @JsonProperty
    public SeCodeList getSeCodeList() {
        return null;
    }
}
