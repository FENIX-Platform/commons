package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Date;

public class SeUpdate extends ResponseHandler {

    public SeUpdate() {}
    public SeUpdate(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Date getUpdateDate() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getUpdatePeriodicity() {
        return null;
    }

}
