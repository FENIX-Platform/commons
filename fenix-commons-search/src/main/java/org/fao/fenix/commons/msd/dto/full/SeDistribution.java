package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Collection;

public class SeDistribution extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Link to the on-line resource")
    @Description(en= "Link to the on-line resource. It is conditional to the policy governing distribution and sharing mechanism. For 'restricted' resources it is not available.")
    private String onlineResource;

    @JsonProperty
    @Label(en="Dissemination formats")
    @Description(en= "Formats available for downloading the resources (e.g. excel, csv, pdf, etc.). . . It is conditional to the policy governing distribution and sharing mechanism. For 'restricted' resources it is not available.")
    private Collection<String> disseminationFormat;


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
