package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeDataCompilation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> missingData;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> weights;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> aggregationProcessing;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private String aggregationFormula;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList dataAdjustment;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> dataAdjustmentDetails;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> indexType;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Date basePeriod;


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
