package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeReleasePolicy extends ResponseHandler {

    public SeReleasePolicy() {}
    public SeReleasePolicy(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getReleaseCalendar() {
        return null;
    }
    @JsonProperty
    public String getReleaseCalendarAccess() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getDisseminationPeriodicity() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjPeriod getEmbargoTime() {
        return null;
    }

}
