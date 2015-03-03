package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class SeCoverage extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList coverageSectors;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> coverageSectorsDetails;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjPeriod coverageTime;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList coverageGeographic;


    public OjCodeList getCoverageSectors() {
        return coverageSectors;
    }
    @Embedded
    public void setCoverageSectors(OjCodeList coverageSectors) {
        this.coverageSectors = coverageSectors;
    }

    public Map<String, String> getCoverageSectorsDetails() {
        return coverageSectorsDetails;
    }

    public void setCoverageSectorsDetails(Map<String, String> coverageSectorsDetails) {
        this.coverageSectorsDetails = coverageSectorsDetails;
    }

    public OjPeriod getCoverageTime() {
        return coverageTime;
    }
    @Embedded
    public void setCoverageTime(OjPeriod coverageTime) {
        this.coverageTime = coverageTime;
    }

    public OjCodeList getCoverageGeographic() {
        return coverageGeographic;
    }
    @Embedded
    public void setCoverageGeographic(OjCodeList coverageGeographic) {
        this.coverageGeographic = coverageGeographic;
    }
}
