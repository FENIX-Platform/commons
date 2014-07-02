package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;

import java.io.Serializable;

public class OjContact extends JSONdto implements Serializable {
    
    @JsonProperty private String phone;
    @JsonProperty private String address;
    @JsonProperty private String emailAddress;
    @JsonProperty private String hoursOfService;
    @JsonProperty private String contactInstruction;


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

    public String getHoursOfService() {
        return hoursOfService;
    }

    public void setHoursOfService(String hoursOfService) {
        this.hoursOfService = hoursOfService;
    }

    public String getContactInstruction() {
        return contactInstruction;
    }

    public void setContactInstruction(String contactInstruction) {
        this.contactInstruction = contactInstruction;
    }
}
