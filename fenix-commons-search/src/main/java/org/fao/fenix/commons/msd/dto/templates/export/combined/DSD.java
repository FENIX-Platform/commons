package org.fao.fenix.commons.msd.dto.templates.export.combined;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public abstract class DSD<T extends org.fao.fenix.commons.msd.dto.templates.export.dsd.DSD> extends ResponseHandler {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }


    @JsonProperty
    public String getUid() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }


    public abstract T getDsd();
}
