package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeReleasePolicy extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> releaseCalendar;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private String releaseCalendarAccess;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList disseminationPeriodicity;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjPeriod embargoTime;


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
