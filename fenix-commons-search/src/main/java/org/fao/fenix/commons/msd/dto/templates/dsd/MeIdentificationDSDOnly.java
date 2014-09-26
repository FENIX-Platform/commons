package org.fao.fenix.commons.msd.dto.templates.dsd;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class MeIdentificationDSDOnly extends ResponseHandler {

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


    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }
}
