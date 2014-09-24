package org.fao.fenix.commons.msd.dto.templates.dsd;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.standard.OjCodeList;
import org.fao.fenix.commons.msd.dto.templates.standard.Period;

import java.util.Collection;

public class DSDDomain extends ResponseHandler {

    public DSDDomain() {}
    public DSDDomain(Object source) {
        super(source);
    }

    @JsonProperty
    public Collection<OjCodeList> getCodes() {
        return null;
    }
    @JsonProperty
    public Collection<String> getEnumeration() {
        return null;
    }
    @JsonProperty
    public Period getPeriod() {
        return null;
    }
    @JsonProperty
    public Collection<Long> getTimeList() {
        return null;
    }

}
