package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;
import org.fao.fenix.commons.msd.dto.type.RepresentationType;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class MeContent extends JSONdto implements Serializable {

    @JsonProperty private RepresentationType resourceRepresentationType;
    @JsonProperty private Collection<String> keyWords;
    @JsonProperty private Map<String, String> description;


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
}
