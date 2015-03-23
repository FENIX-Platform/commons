package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeTimelinessPunctuality extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Timeliness")
    @Description(en= "It refers to the speed of data availability, length of time between data availability and the event or phenomenon they describe.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> timeliness;

    @JsonProperty
    @Label(en="Punctuality")
    @Description(en= "Time lag between the release date of data and the target date announced in some official release calendar.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> punctuality;


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
