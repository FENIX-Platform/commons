package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeDataSource  extends ResponseHandler {

    public SeDataSource() {}
    public SeDataSource(Object source) {
        super(source);
    }


    @JsonProperty
    public SePrimaryDataCollection getSePrimaryDataCollection() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeSecondaryDataCollection getSeSecondaryDataCollection() {
        return null;
    }

}
