package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Collection;

public class SeDistribution extends JSONEntity implements Serializable {

    @JsonProperty private String onlineResource;
    @JsonProperty private Collection<String> disseminationFormat;


    public String getOnlineResource() {
        return onlineResource;
    }

    public void setOnlineResource(String onlineResource) {
        this.onlineResource = onlineResource;
    }

    public Collection<String> getDisseminationFormat() {
        return disseminationFormat;
    }

    public void setDisseminationFormat(Collection<String> disseminationFormat) {
        this.disseminationFormat = disseminationFormat;
    }
}
