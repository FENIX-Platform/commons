package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeReleasePolicy extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Release calendar",fr="Calendrier de publication",es="Calendario de lanzamientos")
    @Description(en= "Policy regarding the release of the resource in accordance with the pre-announced schedule. It also provides information on the availability of the release calendar.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Map<String, String> releaseCalendar;

    @JsonProperty
    @Label(en="Access to the release calendar",fr="Accès au calendrier de publication",es="Acceso al calendario de publicación")
    @Description(en= "Link or references to the release calendar.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private String releaseCalendarAccess;

    @JsonProperty
    @Label(en="Dissemination periodicity",fr="Périodicité de diffusion",es="Periodicidad difusión")
    @Description(en= "Frequency of data dissemination (e.g. daily, monthly, quarterly, yearly).")
    @Order(3)
    @Format(Format.FORMAT.string)
    private OjCodeList disseminationPeriodicity;

    @JsonProperty
    @Label(en="Embargo time",fr="Temps de Embargo",es="Tiempo de embargo")
    @Description(en= "Time span between the completion of the production process of statistical data and their publication.")
    @Order(4)
    @Format(Format.FORMAT.string)
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
