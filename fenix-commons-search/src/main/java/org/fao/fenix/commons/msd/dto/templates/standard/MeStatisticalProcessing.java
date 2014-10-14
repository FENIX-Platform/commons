package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class MeStatisticalProcessing extends ResponseHandler {

    public MeStatisticalProcessing() {}
    public MeStatisticalProcessing(Object source) {
        super(source);
    }



    @JsonProperty
    public SeDataSource getSeDataSource() {
        return null;
    }
    @JsonProperty
    public SeDataCompilation getSeDataCompilation() {
        return null;
    }
    @JsonProperty
    public SeDataValidation getSeDataValidation() {
        return null;
    }

}
