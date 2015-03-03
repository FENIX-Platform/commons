package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeClarity extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> clarity;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Integer metadataCompletenessRate;


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
