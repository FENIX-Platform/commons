package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeDataCompilation extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> missingData;
    @JsonProperty private Map<String, String> weights;
    @JsonProperty private Map<String, String> aggregationProcessing;
    @JsonProperty private String aggregationFormula;
    @JsonProperty private OjCodeList dataAdjustment;
    @JsonProperty private Map<String, String> dataAdjustmentDetails;
    @JsonProperty private Map<String, String> indexType;
    @JsonProperty private Date basePeriod;


    public Map<String, String> getMissingData() {
        return missingData;
    }

    public void setMissingData(Map<String, String> missingData) {
        this.missingData = missingData;
    }

    public Map<String, String> getWeights() {
        return weights;
    }

    public void setWeights(Map<String, String> weights) {
        this.weights = weights;
    }

    public Map<String, String> getAggregationProcessing() {
        return aggregationProcessing;
    }

    public void setAggregationProcessing(Map<String, String> aggregationProcessing) {
        this.aggregationProcessing = aggregationProcessing;
    }

    public String getAggregationFormula() {
        return aggregationFormula;
    }

    public void setAggregationFormula(String aggregationFormula) {
        this.aggregationFormula = aggregationFormula;
    }

    public OjCodeList getDataAdjustment() {
        return dataAdjustment;
    }
    @Embedded
    public void setDataAdjustment(OjCodeList dataAdjustment) {
        this.dataAdjustment = dataAdjustment;
    }

    public Map<String, String> getDataAdjustmentDetails() {
        return dataAdjustmentDetails;
    }

    public void setDataAdjustmentDetails(Map<String, String> dataAdjustmentDetails) {
        this.dataAdjustmentDetails = dataAdjustmentDetails;
    }

    public Map<String, String> getIndexType() {
        return indexType;
    }

    public void setIndexType(Map<String, String> indexType) {
        this.indexType = indexType;
    }

    public Date getBasePeriod() {
        return basePeriod;
    }

    public void setBasePeriod(Date basePeriod) {
        this.basePeriod = basePeriod;
    }
}
