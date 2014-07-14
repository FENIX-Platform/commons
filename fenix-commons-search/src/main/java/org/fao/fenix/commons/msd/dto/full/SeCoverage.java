package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class SeCoverage extends JSONEntity implements Serializable {

    @JsonProperty private Collection<OjCodeList> coverageSector;
    @JsonProperty private Map<String, String> coverageSectorDetails;
    @JsonProperty @Embedded private Period coverageTime;
    @JsonProperty private Collection<OjCodeList> coverageGeographic;


    public Collection<OjCodeList> getCoverageSector() {
        return coverageSector;
    }

    public void setCoverageSector(Collection<OjCodeList> coverageSector) {
        this.coverageSector = coverageSector;
    }

    public Map<String, String> getCoverageSectorDetails() {
        return coverageSectorDetails;
    }

    public void setCoverageSectorDetails(Map<String, String> coverageSectorDetails) {
        this.coverageSectorDetails = coverageSectorDetails;
    }

    public Period getCoverageTime() {
        return coverageTime;
    }

    public void setCoverageTime(Period coverageTime) {
        this.coverageTime = coverageTime;
    }

    public Collection<OjCodeList> getCoverageGeographic() {
        return coverageGeographic;
    }

    public void setCoverageGeographic(Collection<OjCodeList> coverageGeographic) {
        this.coverageGeographic = coverageGeographic;
    }
}
