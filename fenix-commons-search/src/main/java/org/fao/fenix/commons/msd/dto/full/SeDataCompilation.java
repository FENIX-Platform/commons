package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeDataCompilation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Missing data")
    @Description(en= "It describe under which circumstance missing data are estimated or imputed and when the cells are left empty. It also describe methodologies used to estimate/impute missing values.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> missingData;

    @JsonProperty
    @Label(en="Weights")
    @Description(en= "Description of weights system (if any) used in order to produce accurate statistical results. This field reports the criteria for using weights in analysis of collection, the formulas and coefficients developed and how they are applied to data.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> weights;

    @JsonProperty
    @Label(en="Process of aggregation")
    @Description(en= "Information about the methodology used to aggregate data.")
    @Order(3)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> aggregationProcessing;

    @JsonProperty
    @Label(en="Aggregation formula")
    @Description(en= "Formula used to aggregate data.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private String aggregationFormula;

    @JsonProperty
    @Label(en="Process of adjustment")
    @Description(en= "Type of adjustment used represented by a code.")
    @Order(5)
    @Format(Format.FORMAT.string)
    private OjCodeList dataAdjustment;

    @JsonProperty
    @Label(en="Details on process of adjustment")
    @Description(en= "Set of procedures employed to modify statistical data to enable it to be conform with national or international standards (such as seasonal adjustment methods, time series decomposition, or other similar methods).")
    @Order(6)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> dataAdjustmentDetails;

    @JsonProperty
    @Label(en="Type of index")
    @Description(en= "Type of index number used in the statistical production process.")
    @Order(7)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> indexType;

    @JsonProperty
    @Label(en="Base period")
    @Description(en= "Period of time used as a base of an index number or to which a time series refers (e.g. base year 2000 for certain annual data).")
    @Order(8)
    @Format(Format.FORMAT.date)
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
