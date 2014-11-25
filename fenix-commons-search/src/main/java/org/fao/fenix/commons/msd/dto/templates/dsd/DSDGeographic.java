package org.fao.fenix.commons.msd.dto.templates.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSDGeographic extends DSD {

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
