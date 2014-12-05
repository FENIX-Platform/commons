package org.fao.fenix.commons.msd.dto.templates.codeList;

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
    public Map<String,String> getResourceRepresentationTypeLabel() {
        RepresentationType value = getResourceRepresentationType();
        return value!=null ? value.getLabel() : null;
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
    public SeCodeList getSeCodeList() {
        return null;
    }
}
