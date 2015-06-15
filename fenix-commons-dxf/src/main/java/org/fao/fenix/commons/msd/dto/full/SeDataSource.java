package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeDataSource extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Primary Data Collection")
    @Description(en= "This section describes the procedures used to collect data obtained directly from first-hand sources by means of surveys, observation or experimentation.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private SePrimaryDataCollection sePrimaryDataCollection;

    @JsonProperty
    @Label(en="Secondary Data Collection")
    @Description(en= "This section is filled when the agency compiling and publishing data does not coincide with the entity (subject, agency or institution) who has conducted the procedure of collecting data. It reports information about the source that have already collected data.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private SeSecondaryDataCollection seSecondaryDataCollection;


    public SePrimaryDataCollection getSePrimaryDataCollection() {
        return sePrimaryDataCollection;
    }
    @Embedded
    public void setSePrimaryDataCollection(SePrimaryDataCollection sePrimaryDataCollection) {
        this.sePrimaryDataCollection = sePrimaryDataCollection;
    }

    public SeSecondaryDataCollection getSeSecondaryDataCollection() {
        return seSecondaryDataCollection;
    }
    @Embedded
    public void setSeSecondaryDataCollection(SeSecondaryDataCollection seSecondaryDataCollection) {
        this.seSecondaryDataCollection = seSecondaryDataCollection;
    }
}
