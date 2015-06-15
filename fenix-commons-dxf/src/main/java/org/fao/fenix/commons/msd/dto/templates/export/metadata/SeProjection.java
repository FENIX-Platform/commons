package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeProjection extends ResponseHandler {

    public SeProjection() {}
    public SeProjection(Object source) {
        super(source);
    }


    @JsonProperty
    public OjCodeList getProjection() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getProjectionName() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeProjectionParameters getSeProjectionParameters() {
        return null;
    }

}
