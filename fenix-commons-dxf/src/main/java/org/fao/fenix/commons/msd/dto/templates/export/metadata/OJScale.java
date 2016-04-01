package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class OJScale extends ResponseHandler {

    public OJScale() {}
    public OJScale(Object source) {
        super(source);
    }

    @JsonProperty
    public Double getMaxScaleFactor() {
        return null;
    }
    @JsonProperty
    public Double getMinScaleFactor() {
        return null;
    }
}
