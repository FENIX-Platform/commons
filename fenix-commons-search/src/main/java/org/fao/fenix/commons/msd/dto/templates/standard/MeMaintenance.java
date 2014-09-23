package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class MeMaintenance extends ResponseHandler {

    public MeMaintenance() {}
    public MeMaintenance(Object source) {
        super(source);
    }



    @JsonProperty
    public Map<String, String> getMaintenanceAgency() {
        return null;
    }
    @JsonProperty
    public SeUpdate getSeUpdate() {
        return null;
    }
    @JsonProperty
    public SeMetadataMaintenance getSeMetadataMaintenance() {
        return null;
    }

}
