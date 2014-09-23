package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeEllipsoid extends ResponseHandler {

    public SeEllipsoid() {}
    public SeEllipsoid(Object source) {
        super(source);
    }



    @JsonProperty
    public OjCodeList getEllipsoid() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getEllipsoidName() {
        return null;
    }
    @JsonProperty
    public SeEllipsoidParameters getSeEllipsoidParameters() {
        return null;
    }

}
