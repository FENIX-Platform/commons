package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeConfidentiality extends ResponseHandler {

    public SeConfidentiality() {}
    public SeConfidentiality(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getConfidentialityPolicy() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getConfidentialityDataTreatment() {
        return null;
    }
    @JsonProperty
    public OjCodeList getConfidentialityStatus() {
        return null;
    }

}
