package org.fao.fenix.commons.msd.dto.templates.standard.metadata;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class OjScale extends ResponseHandler {

    public OjScale() {}
    public OjScale(Object ... source) {
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
