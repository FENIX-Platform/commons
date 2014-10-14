package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeReferencePopulation extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> statisticalPopulation;
    @JsonProperty private Map<String, String> statisticalUnit;
    @JsonProperty private OjCodeList referencePeriod;
    @JsonProperty private OjCodeList referenceArea;


    public Map<String, String> getStatisticalPopulation() {
        return statisticalPopulation;
    }

    public void setStatisticalPopulation(Map<String, String> statisticalPopulation) {
        this.statisticalPopulation = statisticalPopulation;
    }

    public Map<String, String> getStatisticalUnit() {
        return statisticalUnit;
    }

    public void setStatisticalUnit(Map<String, String> statisticalUnit) {
        this.statisticalUnit = statisticalUnit;
    }

    public OjCodeList getReferencePeriod() {
        return referencePeriod;
    }
    @Embedded
    public void setReferencePeriod(OjCodeList referencePeriod) {
        this.referencePeriod = referencePeriod;
    }

    public OjCodeList getReferenceArea() {
        return referenceArea;
    }
    @Embedded
    public void setReferenceArea(OjCodeList referenceArea) {
        this.referenceArea = referenceArea;
    }
}
