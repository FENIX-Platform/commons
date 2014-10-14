package org.fao.fenix.commons.msd.dto.templates.codeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class OjContact extends ResponseHandler {

    public OjContact() {}
    public OjContact(Object source) {
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
    public String getHoursOfService() {
        return null;
    }
    @JsonProperty
    public String getContactInstruction() {
        return null;
    }
}
