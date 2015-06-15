package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeDataDissemination extends ResponseHandler {

    public SeDataDissemination() {}
    public SeDataDissemination(Object source) {
        super(source);
    }


    @JsonProperty
    public SeReleasePolicy getSeReleasePolicy() {
        return null;
    }
    @JsonProperty
    public SeDistribution getSeDistribution() {
        return null;
    }

}
