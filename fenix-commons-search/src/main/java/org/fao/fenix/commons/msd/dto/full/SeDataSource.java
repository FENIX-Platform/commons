package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeDataSource extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SePrimaryDataCollection sePrimaryDataCollection;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
