package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embedded;
import java.util.Collection;

public class DSDDataset extends DSD {

    @JsonProperty private Collection<DSDAggregationRule> aggregationRules;
    @JsonProperty private Collection<DSDColumn> columns;

    public DSDDataset() {}
    public DSDDataset(String rid) {
        setRID(rid);
    }

    public Collection<DSDAggregationRule> getAggregationRules() {
        return aggregationRules;
    }

    public void setAggregationRules(Collection<DSDAggregationRule> aggregationRules) {
        this.aggregationRules = aggregationRules;
    }

    public Collection<DSDColumn> getColumns() {
        return columns;
    }
    @Embedded
    public void setColumns(Collection<DSDColumn> columns) {
        this.columns = columns;
    }

}
