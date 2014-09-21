package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;

public class SeUpdate extends JSONEntity implements Serializable {

    @JsonProperty private Date updateDate;
    @JsonProperty private OjCodeList updatePeriodicity;


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
