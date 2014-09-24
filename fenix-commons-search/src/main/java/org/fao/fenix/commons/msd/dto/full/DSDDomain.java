package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class DSDDomain extends JSONEntity implements Serializable {

    @JsonProperty private Collection<OjCodeList> codes;
    @JsonProperty private Collection<String> enumeration;
    @JsonProperty private Period period;
    @JsonProperty private Collection<Long> timeList;


    public Collection<OjCodeList> getCodes() {
        return codes;
    }
    @Embedded
    public void setCodes(Collection<OjCodeList> codes) {
        this.codes = codes;
    }

    public Collection<String> getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Collection<String> enumeration) {
        this.enumeration = enumeration;
    }

    public Period getPeriod() {
        return period;
    }
    @Embedded
    public void setPeriod(Period period) {
        this.period = period;
    }

    public Collection<Long> getTimeList() {
        return timeList;
    }

    public void setTimeList(Collection<Long> timeList) {
        this.timeList = timeList;
    }
}
