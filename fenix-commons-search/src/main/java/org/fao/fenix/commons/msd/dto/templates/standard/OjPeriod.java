package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Date;

public class OjPeriod extends ResponseHandler {

    public OjPeriod() {}
    public OjPeriod(Object source) {
        super(source);
    }


    @JsonProperty
    public Date getFrom() {
        return null;
    }
    @JsonProperty
    public Date getTo() {
        return null;
    }

}
