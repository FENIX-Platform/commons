package org.fao.fenix.commons.msd.dto.templates.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class DSDDataset extends DSD {

    public DSDDataset() {}
    public DSDDataset(Object source) {
        super(source);
    }


    @JsonProperty
    public Collection<DSDAggregationRule> getAggregationRules() {
        return null;
    }
    @JsonProperty
    public Collection<DSDColumn> getColumns() {
        return null;
    }

}
