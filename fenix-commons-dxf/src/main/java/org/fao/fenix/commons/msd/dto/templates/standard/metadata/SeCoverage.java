package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeCoverage extends ResponseHandler {

    public SeCoverage() {}
    public SeCoverage(Object source) {
        super(source);
    }



    @JsonProperty
    public OjCodeList getCoverageSectors() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getCoverageSectorsDetails() {
        return null;
    }
    @JsonProperty
    public OjPeriod getCoverageTime() {
        return null;
    }
    @JsonProperty
    public OjCodeList getCoverageGeographic() {
        return null;
    }

}
