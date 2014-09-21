package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeDataSource extends JSONEntity implements Serializable {

    @JsonProperty private SePrimaryDataCollection sePrimaryDataCollection;
    @JsonProperty private SeSecondaryDataCollection seSecondaryDataCollection;


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
