package org.fao.fenix.commons.msd.dto.templates.standardDsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSD;

public abstract class MeIdentificationDSDOnly <T extends DSD> extends ResponseHandler {

    public MeIdentificationDSDOnly() {}
    public MeIdentificationDSDOnly(Object source) {
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
