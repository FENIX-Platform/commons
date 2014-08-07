package org.fao.fenix.commons.msd.dto.full;

import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Collection;

public class DSDDomain extends JSONEntity implements Serializable {

    private Collection<OjCodeList> codes;
    private Collection<OjCode> customCodes;
    private String enumeration;
    private Period period;


    public Collection<OjCodeList> getCodes() {
        return codes;
    }

    public void setCodes(Collection<OjCodeList> codes) {
        this.codes = codes;
    }

    public Collection<OjCode> getCustomCodes() {
        return customCodes;
    }

    public void setCustomCodes(Collection<OjCode> customCodes) {
        this.customCodes = customCodes;
    }

    public String getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
