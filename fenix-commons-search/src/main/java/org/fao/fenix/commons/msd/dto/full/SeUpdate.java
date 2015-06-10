package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;

public class SeUpdate extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Last update date",fr="Dernière date de mise à jour",es="Última fecha de actualización")
    @Description(en= "Last physical update date.")
    @Order(1)
    @Format(Format.FORMAT.date)
    private Date updateDate;

    @JsonProperty
    @Label(en="Frequency of update",fr="Fréquence de mise à jour",es="Frecuencia de actualización")
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
