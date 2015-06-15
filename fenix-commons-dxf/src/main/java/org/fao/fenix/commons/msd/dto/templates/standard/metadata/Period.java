package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class Period extends ResponseHandler {

    public Period() {}
    public Period(Object source) {
        super(source);
    }


    @JsonProperty
    public Long getFrom() {
        return null;
    }
    @JsonProperty
    public Long getTo() {
        return null;
    }

}
