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
    @Label(en="Main sector(s) (coded)")
    @Description(en= "Sector(s) the resource refers to as specified in the selected codelist. The word 'Sector' indicates the subject area the resource refers to. These sectors can be institutional sectors, economic or other sectors (e.g. local government sector, agriculture, forestry, business services, etc.).")
    private OjCodeList coverageSectors;

    @JsonProperty
    @Label(en="Main sector(s)")
    @Description(en= "Textual element delimiting the statistical results with regard to the main sectors covered.")
    private Map<String, String> coverageSectorsDetails;

    @JsonProperty
    @Label(en="Coverage period")
    @Description(en= "Information about the time period for which data are available. It requests to report the time window of reference (reporting the starting date and the ending date) even if it presents some lacks.")
    private OjPeriod coverageTime;

    @JsonProperty
    @Label(en="Geographic extent")
    @Description(en= "Geographical coverage represented by the resource. It is highly recommended to make reference to officially recognized or easily identifiable macro-areas (e.g. South Saharan Africa, North America, OECD member countries..).")
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
