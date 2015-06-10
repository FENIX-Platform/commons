package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeUpdate getSeUpdate() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.SeMetadataMaintenance getSeMetadataMaintenance() {
        return null;
    }

}
