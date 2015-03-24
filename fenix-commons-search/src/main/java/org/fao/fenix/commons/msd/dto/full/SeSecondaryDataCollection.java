package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class SeSecondaryDataCollection extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Origin of collected data")
    @Description(en= "Coded element which allows to specify in a standard way the origin of the resource.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private OjCodeList originOfCollectedData;

    @JsonProperty
    @Label(en="Organization")
    @Description(en= "If the element <<originOfCollectedData>> has been generally specified as 'other International Organizations' this element requests to report the exact source of the resource.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> organization;

    @JsonProperty
    @Label(en="Description of raw data")
    @Description(en= "Characteristics and components of the raw statistical data used for compiling statistical aggregates. It indicates if data set is based on a survey or on administrative data source. If administrative registers are used, the description of registers should be given (source, year, primary purpose, potential deficiencies. . . ).")
    @Order(3)
    @Format(Format.FORMAT.string)
    private Map<String, String> rawDataDescription;

    @JsonProperty
    @Label(en="Data collection")
    @Description(en= "Data collection details")
    @Order(4)
    @Format(Format.FORMAT.string)
    private Map<String, String> dataCollection;



    public OjCodeList getOriginOfCollectedData() {
        return originOfCollectedData;
    }
    @Embedded
    public void setOriginOfCollectedData(OjCodeList originOfCollectedData) {
        this.originOfCollectedData = originOfCollectedData;
    }

    public Map<String, String> getOrganization() {
        return organization;
    }
    @Embedded
    public void setOrganization(Map<String, String> organization) {
        this.organization = organization;
    }

    public Map<String, String> getRawDataDescription() {
        return rawDataDescription;
    }

    public void setRawDataDescription(Map<String, String> rawDataDescription) {
        this.rawDataDescription = rawDataDescription;
    }

    public Map<String, String> getDataCollection() {
        return dataCollection;
    }

    public void setDataCollection(Map<String, String> dataCollection) {
        this.dataCollection = dataCollection;
    }
}
