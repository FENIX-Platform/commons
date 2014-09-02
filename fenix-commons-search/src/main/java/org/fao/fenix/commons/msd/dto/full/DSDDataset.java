package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.Embedded;

public class DSDDataset extends DSD {

    @JsonProperty private DSDAggregationRule[] aggregationRules;
    @JsonProperty private DSDColumn[] columns;


    public DSDAggregationRule[] getAggregationRules() {
        return aggregationRules;
    }

    public void setAggregationRules(DSDAggregationRule[] aggregationRules) {
        this.aggregationRules = aggregationRules;
    }

    public DSDColumn[] getColumns() {
        return columns;
    }
    @Embedded
    public void setColumns(DSDColumn[] columns) {
        this.columns = columns;
    }

}
