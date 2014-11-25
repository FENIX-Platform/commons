package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class SeSecondaryDataCollection extends JSONEntity implements Serializable {

    @JsonProperty private OjCodeList originOfCollectedData;
    @JsonProperty private Map<String, String> organization;
    @JsonProperty private Map<String, String> rawDataDescription;
    @JsonProperty private Map<String, String> dataCollection;



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
