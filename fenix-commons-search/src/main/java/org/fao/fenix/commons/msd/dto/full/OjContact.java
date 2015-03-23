package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class OjContact extends JSONEntity implements Serializable {
    
    @JsonProperty
    @Label(en="Telephone number")
    @Description(en="Telephone numbers at which the organization or individual may be contacted.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String phone;

    @JsonProperty
    @Label(en="Address")
    @Description(en="Physical address at which the organization or individual may be contacted.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String address;

    @JsonProperty
    @Label(en="e-mail address")
    @Description(en="E-mail address at which the organization or individual may be contacted.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String emailAddress;

    @JsonProperty
    @Label(en="Hour of service")
    @Description(en="Time period (including time zone) when individuals can contact the organization or individual.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> hoursOfService;

    @JsonProperty
    @Label(en="Instruction")
    @Description(en="Supplemental instructions on how or when to contact the individual or organization.")
    @Order(-1)
    @Format(Format.FORMAT.string)
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
