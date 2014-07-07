package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class OjCodeList extends ResponseHandler {

    public OjCodeList() {}
    public OjCodeList(Object source) {
        super(source);
    }


    @JsonProperty
    public String getCodeList() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }
    @JsonProperty
    public String getCode() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public OjResponsibleParty getContactInfo() {
        return null;
    }
    @JsonProperty
    public String getLink() {
        return null;
    }
}
