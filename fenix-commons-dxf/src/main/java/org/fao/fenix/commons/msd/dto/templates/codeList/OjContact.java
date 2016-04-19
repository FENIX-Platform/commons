package org.fao.fenix.commons.msd.dto.templates.codeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class OjContact extends ResponseHandler {

    public OjContact() {}
    public OjContact(Object ... source) {
        super(source);
    }



    @JsonProperty
    public String getPhone() {
        return null;
    }
    @JsonProperty
    public String getAddress() {
        return null;
    }
    @JsonProperty
    public String getEmailAddress() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getHoursOfService() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getContactInstruction() {
        return null;
    }

}
