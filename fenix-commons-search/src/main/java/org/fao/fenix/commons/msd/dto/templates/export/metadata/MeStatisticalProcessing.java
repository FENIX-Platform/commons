package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class MeStatisticalProcessing extends ResponseHandler {

    public MeStatisticalProcessing() {}
    public MeStatisticalProcessing(Object source) {
        super(source);
    }



    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeDataSource getSeDataSource() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeDataCompilation getSeDataCompilation() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeDataValidation getSeDataValidation() {
        return null;
    }

}
