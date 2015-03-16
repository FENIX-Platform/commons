package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeClarity extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Clarity")
    @Description(en= "Extent to which easily comprehensible metadata are available. It indicates whether a resource is accompanied by appropriate metadata and other relevant documentation.")
    private Map<String, String> clarity;

    @JsonProperty
    @Label(en="Metadata completeness rate")
    @Description(en= "The percentage of completeness of metadata offers a numerical evaluation of the extent to which the resource is documented.")
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
