package org.fao.fenix.commons.msd.dto.templates.identification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeIdentification extends ResponseHandler {

    public MeIdentification() {}
    public MeIdentification(Object source) {
        super(source);
    }


    @JsonProperty
    public String getUid() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }


}
