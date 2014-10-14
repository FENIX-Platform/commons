package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeReferenceSystem extends ResponseHandler {

    public MeReferenceSystem() {}
    public MeReferenceSystem(Object source) {
        super(source);
    }



    @JsonProperty
    public String getReferenceSystemIdentifier() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getReferenceSystemName() {
        return null;
    }
    @JsonProperty
    public OjResponsibleParty getReferenceSystemAuthority() {
        return null;
    }
    @JsonProperty
    public SeProjection getSeProjection() {
        return null;
    }
    @JsonProperty
    public SeEllipsoid getSeEllipsoid() {
        return null;
    }
    @JsonProperty
    public SeDatum getSeDatum() {
        return null;
    }

}
