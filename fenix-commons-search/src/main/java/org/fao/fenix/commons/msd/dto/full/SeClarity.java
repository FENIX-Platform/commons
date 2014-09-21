package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeClarity extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> clarity;
    @JsonProperty private Integer metadataCompletenessRate;


    public Map<String, String> getClarity() {
        return clarity;
    }

    public void setClarity(Map<String, String> clarity) {
        this.clarity = clarity;
    }

    public Integer getMetadataCompletenessRate() {
        return metadataCompletenessRate;
    }

    public void setMetadataCompletenessRate(Integer metadataCompletenessRate) {
        this.metadataCompletenessRate = metadataCompletenessRate;
    }
}
