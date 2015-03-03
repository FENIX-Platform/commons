package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeStatisticalProcessing extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDataSource seDataSource;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDataCompilation seDataCompilation;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDataValidation seDataValidation;


    public SeDataSource getSeDataSource() {
        return seDataSource;
    }
    @Embedded
    public void setSeDataSource(SeDataSource seDataSource) {
        this.seDataSource = seDataSource;
    }

    public SeDataCompilation getSeDataCompilation() {
        return seDataCompilation;
    }
    @Embedded
    public void setSeDataCompilation(SeDataCompilation seDataCompilation) {
        this.seDataCompilation = seDataCompilation;
    }

    public SeDataValidation getSeDataValidation() {
        return seDataValidation;
    }
    @Embedded
    public void setSeDataValidation(SeDataValidation seDataValidation) {
        this.seDataValidation = seDataValidation;
    }
}
