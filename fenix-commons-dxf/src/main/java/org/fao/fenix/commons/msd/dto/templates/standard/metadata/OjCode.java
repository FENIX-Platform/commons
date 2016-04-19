package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.codeList.Code;

import java.util.Map;

public class OjCode extends ResponseHandler {

    public OjCode() {}
    public OjCode(Object ... source) {
        super(source);
    }


    @JsonProperty
    public String getCode() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getLabel() {
        Code linked = getLinkedCode();
        return linked!=null ? linked.getTitle() : null;
    }

    public Code getLinkedCode() {
        return null;
    }

}
