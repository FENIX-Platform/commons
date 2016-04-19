package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeReferencePopulation extends ResponseHandler {

    public SeReferencePopulation() {}
    public SeReferencePopulation(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getStatisticalPopulation() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getStatisticalUnit() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getReferencePeriod() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getReferenceArea() {
        return null;
    }

}
