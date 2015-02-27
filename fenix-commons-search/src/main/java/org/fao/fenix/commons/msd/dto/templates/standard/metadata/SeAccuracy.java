package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeAccuracy extends ResponseHandler {

    public SeAccuracy() {}
    public SeAccuracy(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getAccuracyNonSampling() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getAccuracySampling() {
        return null;
    }

}
