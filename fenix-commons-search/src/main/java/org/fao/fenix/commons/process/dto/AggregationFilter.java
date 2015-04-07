package org.fao.fenix.commons.process.dto;

import org.fao.fenix.commons.msd.dto.full.DSDAggregationRule;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AggregationFilter {
    private LinkedHashSet<String> key;
    private LinkedHashMap<String,DSDAggregationRule> rules;


    public LinkedHashSet<String> getKey() {
        return key;
    }

    public void setKey(LinkedHashSet<String> key) {
        this.key = key;
    }

    public LinkedHashMap<String, DSDAggregationRule> getRules() {
        return rules;
    }

    public void setRules(LinkedHashMap<String, DSDAggregationRule> rules) {
        this.rules = rules;
    }
}
