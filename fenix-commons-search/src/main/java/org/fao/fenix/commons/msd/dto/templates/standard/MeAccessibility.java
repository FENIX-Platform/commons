package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class MeAccessibility extends ResponseHandler {

    public MeAccessibility() {}
    public MeAccessibility(Object source) {
        super(source);
    }


    @JsonProperty
    public SeDataDissemination getSeDataDissemination() {
        return null;
    }
    @JsonProperty
    public SeClarity getSeClarity() {
        return null;
    }
    @JsonProperty
    public SeConfidentiality getSeConfidentiality() {
        return null;
    }

}
