package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeEllipsoid extends ResponseHandler {

    public SeEllipsoid() {}
    public SeEllipsoid(Object source) {
        super(source);
    }



    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getEllipsoid() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getEllipsoidName() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeEllipsoidParameters getSeEllipsoidParameters() {
        return null;
    }

}
