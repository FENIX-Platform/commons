package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeTimelinessPunctuality extends ResponseHandler {

    public SeTimelinessPunctuality() {}
    public SeTimelinessPunctuality(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getTimeliness() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getPunctuality() {
        return null;
    }

}