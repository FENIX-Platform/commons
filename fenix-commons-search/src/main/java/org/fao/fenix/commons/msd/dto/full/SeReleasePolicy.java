package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeReleasePolicy extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> releaseCalendar;
    @JsonProperty private String releaseCalendarAccess;
    @JsonProperty private OjCodeList disseminationPeriodicity;
    @JsonProperty private OjPeriod embargoTime;


    public Map<String, String> getReleaseCalendar() {
        return releaseCalendar;
    }

    public void setReleaseCalendar(Map<String, String> releaseCalendar) {
        this.releaseCalendar = releaseCalendar;
    }

    public String getReleaseCalendarAccess() {
        return releaseCalendarAccess;
    }

    public void setReleaseCalendarAccess(String releaseCalendarAccess) {
        this.releaseCalendarAccess = releaseCalendarAccess;
    }

    public OjCodeList getDisseminationPeriodicity() {
        return disseminationPeriodicity;
    }
    @Embedded
    public void setDisseminationPeriodicity(OjCodeList disseminationPeriodicity) {
        this.disseminationPeriodicity = disseminationPeriodicity;
    }

    public OjPeriod getEmbargoTime() {
        return embargoTime;
    }
    @Embedded
    public void setEmbargoTime(OjPeriod embargoTime) {
        this.embargoTime = embargoTime;
    }
}
