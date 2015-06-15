package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSDGeographic extends DSD {

    public DSDGeographic() {}
    public DSDGeographic(String rid) {
        setRID(rid);
    }

    @JsonProperty private String workspace;
    @JsonProperty private String layerName;


    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }
}
