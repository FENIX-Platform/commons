package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.Embedded;
import java.util.Collection;

public class DSDDataset extends DSD {

    @JsonProperty private Collection<DSDAggregationRule> aggregationRules;
    @JsonProperty private Collection<DSDColumn> columns;


    public Collection<DSDAggregationRule> getAggregationRules() {
        return aggregationRules;
    }
    @Embedded
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
