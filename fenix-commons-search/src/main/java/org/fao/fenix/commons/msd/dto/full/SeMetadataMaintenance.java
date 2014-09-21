package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Date;

public class SeMetadataMaintenance extends JSONEntity implements Serializable {

    @JsonProperty private Date metadataLastCertified;
    @JsonProperty private Date metadataLastPosted;
    @JsonProperty private Date metadataLastUpdate;


    public Date getMetadataLastCertified() {
        return metadataLastCertified;
    }

    public void setMetadataLastCertified(Date metadataLastCertified) {
        this.metadataLastCertified = metadataLastCertified;
    }

    public Date getMetadataLastPosted() {
        return metadataLastPosted;
    }

    public void setMetadataLastPosted(Date metadataLastPosted) {
        this.metadataLastPosted = metadataLastPosted;
    }

    public Date getMetadataLastUpdate() {
        return metadataLastUpdate;
    }

    public void setMetadataLastUpdate(Date metadataLastUpdate) {
        this.metadataLastUpdate = metadataLastUpdate;
    }
}
