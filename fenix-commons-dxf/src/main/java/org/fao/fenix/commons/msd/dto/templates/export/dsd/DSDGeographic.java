package org.fao.fenix.commons.msd.dto.templates.export.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSDGeographic extends org.fao.fenix.commons.msd.dto.templates.export.dsd.DSD {

    public DSDGeographic() {}
    public DSDGeographic(Object source) {
        super(source);
    }


    @JsonProperty
    public String getWorkspace() {
        return null;
    }
    @JsonProperty
    public String getLayerName() {
        return null;
    }

}
