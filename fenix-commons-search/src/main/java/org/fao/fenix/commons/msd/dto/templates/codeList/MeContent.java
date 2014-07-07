package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class MeContent extends ResponseHandler {

    public MeContent() {}
    public MeContent(Object source) {
        super(source);
    }


    @JsonProperty
    public Collection<String> getKeyWords() {
        return null;
    }

    @JsonProperty
    public Map<String, String> getDescription() {
        return null;
    }

    @JsonProperty
    public SeCodeList getSeCodeList() {
        return null;
    }


}
