package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SeDatum extends ResponseHandler {

    public SeDatum() {}
    public SeDatum(Object source) {
        super(source);
    }


    @JsonProperty
    public Map<String, String> getDatumName() {
        return null;
    }
    @JsonProperty
    public OjCodeList getDatum() {
        return null;
    }

}
