package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OjPeriod extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Date from")
    @Description(en="Start point of time delimiting a time interval.")
    @Order(1)
    @Format(Format.FORMAT.date)
    private Date from;

    @JsonProperty
    @Label(en="Date to")
    @Description(en="End point of time delimiting a time interval.")
    @Order(2)
    @Format(Format.FORMAT.date)
    private Date to;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
