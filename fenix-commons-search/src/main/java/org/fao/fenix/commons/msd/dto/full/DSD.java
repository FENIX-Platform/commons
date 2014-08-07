package org.fao.fenix.commons.msd.dto.full;

import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class DSD extends JSONEntity implements Serializable {

    private String contextSystem;
    private String datasource;
    private DSDAggregationRule[] aggregationRules;
    private DSDColumn[] columns;


    public String getContextSystem() {
        return contextSystem;
    }

    public void setContextSystem(String contextSystem) {
        this.contextSystem = contextSystem;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public DSDAggregationRule[] getAggregationRules() {
        return aggregationRules;
    }

    public void setAggregationRules(DSDAggregationRule[] aggregationRules) {
        this.aggregationRules = aggregationRules;
    }

    public DSDColumn[] getColumns() {
        return columns;
    }

    public void setColumns(DSDColumn[] columns) {
        this.columns = columns;
    }
}
