package org.fao.fenix.commons.msd.dto.templates.standard.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.io.Serializable;
import java.util.Map;

public class DSDColumnSubject extends ResponseHandler {

    public DSDColumnSubject() {}
    public DSDColumnSubject(Object source) {
        super(source);
    }


    @JsonProperty
    public String getName() {
        return null;
    }
    @JsonProperty
    public String getLink() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
}
