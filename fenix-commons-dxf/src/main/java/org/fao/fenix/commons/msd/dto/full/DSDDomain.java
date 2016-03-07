package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

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


    @Override
    public DSDDomain clone() {
        DSDDomain clone = new DSDDomain();

        clone.setEnumeration(getEnumeration()!=null ? new LinkedList<>(getEnumeration()) : null);
        clone.setTimeList(getTimeList()!=null ? new LinkedList<>(getTimeList()) : null);
        clone.setPeriod(getPeriod()!=null ? getPeriod().clone() : null);
        clone.setCodes(cloneCodes());

        return clone;
    }

    private Collection<OjCodeList> cloneCodes() {
        Collection<OjCodeList> clone = null;
        if (getCodes()!=null) {
            clone = new LinkedList<>();
            for (OjCodeList codeList : getCodes())
                clone.add(codeList.clone());
        }
        return clone;
    }
}
