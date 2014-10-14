package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeTimelinessPunctuality extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> timeliness;
    @JsonProperty private Map<String, String> punctuality;


    public Map<String, String> getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Map<String, String> timeliness) {
        this.timeliness = timeliness;
    }

    public Map<String, String> getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(Map<String, String> punctuality) {
        this.punctuality = punctuality;
    }
}
