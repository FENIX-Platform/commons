package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Date;

public class SeUpdate extends ResponseHandler {

    public SeUpdate() {}
    public SeUpdate(Object source) {
        super(source);
    }


    @JsonProperty
    public Date getUpdateDate() {
        return null;
    }
    @JsonProperty
    public OjCodeList getUpdatePeriodicity() {
        return null;
    }

}
