package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class Code extends ResponseHandler {

    public Code() {}
    public Code(Object source) {
        super(source);
    }
    

    @JsonProperty
    public String getCode() {
        return null;
    }
    @JsonProperty
    public Integer getLevel() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDescription() {
        return null;
    }
    @JsonProperty
    public Period getValidityPeriod() {
        return null;
    }
    @JsonProperty
    public Collection<Code> getChildren() {
        return null;
    }
}
