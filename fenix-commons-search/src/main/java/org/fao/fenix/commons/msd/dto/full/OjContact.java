package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class OjContact extends JSONEntity implements Serializable {
    
    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String phone;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String address;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String emailAddress;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> hoursOfService;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> contactInstruction;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Map<String, String> getHoursOfService() {
        return hoursOfService;
    }

    public void setHoursOfService(Map<String, String> hoursOfService) {
        this.hoursOfService = hoursOfService;
    }

    public Map<String, String> getContactInstruction() {
        return contactInstruction;
    }

    public void setContactInstruction(Map<String, String> contactInstruction) {
        this.contactInstruction = contactInstruction;
    }
}
