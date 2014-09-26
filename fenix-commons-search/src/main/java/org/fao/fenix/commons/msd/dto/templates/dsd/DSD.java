package org.fao.fenix.commons.msd.dto.templates.dsd;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class DSD extends ResponseHandler {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }

    @JsonProperty
    public String getContextSystem() {
        return null;
    }
    @JsonProperty
    public String getDatasource() {
        return null;
    }

}
