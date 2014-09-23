package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeComparability extends ResponseHandler {

    public SeComparability() {}
    public SeComparability(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getComparabilityGeographical() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getComparabilityTime() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getCoherenceIntern() {
        return null;
    }

}
