package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeDataRevision extends ResponseHandler {

    public SeDataRevision() {}
    public SeDataRevision(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getRevisionPolicy() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getRevisionPractice() {
        return null;
    }

}