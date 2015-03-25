package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;

public class SeUpdate extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Last update date")
    @Description(en= "Last physical update date.")
    @Order(1)
    @Format(Format.FORMAT.date)
    private Date updateDate;

    @JsonProperty
    @Label(en="Frequency of update")
    @Description(en= "Frequency of upgrade.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private OjCodeList updatePeriodicity;


    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public OjCodeList getUpdatePeriodicity() {
        return updatePeriodicity;
    }
    @Embedded
    public void setUpdatePeriodicity(OjCodeList updatePeriodicity) {
        this.updatePeriodicity = updatePeriodicity;
    }
}
