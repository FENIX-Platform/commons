package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeAccuracy extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> accuracyNonSampling;
    @JsonProperty private Map<String, String> accuracySampling;


    public Map<String, String> getAccuracyNonSampling() {
        return accuracyNonSampling;
    }

    public void setAccuracyNonSampling(Map<String, String> accuracyNonSampling) {
        this.accuracyNonSampling = accuracyNonSampling;
    }

    public Map<String, String> getAccuracySampling() {
        return accuracySampling;
    }

    public void setAccuracySampling(Map<String, String> accuracySampling) {
        this.accuracySampling = accuracySampling;
    }
}
