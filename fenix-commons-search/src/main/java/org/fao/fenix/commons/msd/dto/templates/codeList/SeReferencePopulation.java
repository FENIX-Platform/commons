package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class SeReferencePopulation extends ResponseHandler {

    public SeReferencePopulation() {}
    public SeReferencePopulation(Object source) {
        super(source);
    }

    @JsonProperty
    public OjCodeList getReferencePeriod() {
        return null;
    }
}
