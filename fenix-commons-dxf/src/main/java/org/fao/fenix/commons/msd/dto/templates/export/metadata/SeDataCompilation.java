package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Date;
import java.util.Map;

public class SeDataCompilation extends ResponseHandler {

    public SeDataCompilation() {}
    public SeDataCompilation(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getMissingData() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getWeights() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getAggregationProcessing() {
        return null;
    }
    @JsonProperty
    public String getAggregationFormula() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getDataAdjustment() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataAdjustmentDetails() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getIndexType() {
        return null;
    }
    @JsonProperty
    public Date getBasePeriod() {
        return null;
    }

}
