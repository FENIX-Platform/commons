package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class OjCode extends ResponseHandler {

    public OjCode() {}
    public OjCode(Object source) {
        super(source);
    }



    public Code getLinkedCode() {
        return null;
    }


    @JsonProperty
    public String getCode() {
        return null;
    }

    @JsonProperty
    public Map<String, String> getTitle() {
        Code linked = getLinkedCode();
        return linked!=null ? linked.getTitle() : null;
    }

}
