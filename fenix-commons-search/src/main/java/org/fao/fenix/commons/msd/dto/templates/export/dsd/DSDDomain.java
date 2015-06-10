package org.fao.fenix.commons.msd.dto.templates.export.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList;

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
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.Period getPeriod() {
        return null;
    }
    @JsonProperty
    public Collection<Long> getTimeList() {
        return null;
    }

}
