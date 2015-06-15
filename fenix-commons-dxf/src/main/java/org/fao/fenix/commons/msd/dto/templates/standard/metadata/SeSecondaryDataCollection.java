package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeSecondaryDataCollection extends ResponseHandler {

    public SeSecondaryDataCollection() {}
    public SeSecondaryDataCollection(Object source) {
        super(source);
    }


    @JsonProperty
    public OjCodeList getOriginOfCollectedData() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getOrganization() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getRawDataDescription() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataCollection() {
        return null;
    }


}
