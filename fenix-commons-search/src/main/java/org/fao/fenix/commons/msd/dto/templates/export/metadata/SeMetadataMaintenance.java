package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Date;

public class SeMetadataMaintenance extends ResponseHandler {

    public SeMetadataMaintenance() {}
    public SeMetadataMaintenance(Object source) {
        super(source);
    }


    @JsonProperty
    public Date getMetadataLastCertified() {
        return null;
    }
    @JsonProperty
    public Date getMetadataLastPosted() {
        return null;
    }
    @JsonProperty
    public Date getMetadataLastUpdate() {
        return null;
    }

}
