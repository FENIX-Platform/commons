package org.fao.fenix.commons.msd.dto.templates.export.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class DSDDataset extends org.fao.fenix.commons.msd.dto.templates.export.dsd.DSD {

    public DSDDataset() {}
    public DSDDataset(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDAggregationRule> getAggregationRules() {
        return null;
    }
    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDColumn> getColumns() {
        return null;
    }

}
