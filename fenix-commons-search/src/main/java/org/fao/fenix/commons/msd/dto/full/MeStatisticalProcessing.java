package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeStatisticalProcessing extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Data source")
    @Description(en= "Process used to collect data. It includes a detailed description both of the primary data collection (e.g. type of collection, method to gather data from respondents, sampling procedures..) and the secondary data collection (information about data that have been already collected by another agency or institution).")
    @Order(1)
    @Format(Format.FORMAT.string)
    private SeDataSource seDataSource;

    @JsonProperty
    @Label(en="Data compilation")
    @Description(en= "This section describes the main statistics actions operated on data (e.g. data editing, imputation, weighting, adjustment for non-response, model used etc.).")
    @Order(2)
    @Format(Format.FORMAT.string)
    private SeDataCompilation seDataCompilation;

    @JsonProperty
    @Label(en="Data Validation")
    @Description(en= "Methods and processes for assessing statistical data. It describes the process of monitoring data compilation progress and ensuring the quality of the statistical results.")
    @Order(3)
    @Format(Format.FORMAT.string)
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
