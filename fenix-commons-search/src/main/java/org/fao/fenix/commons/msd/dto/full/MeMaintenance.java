package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeMaintenance extends JSONEntity implements Serializable {

    @JsonProperty private Map<String, String> maintenanceAgency;

    @JsonProperty private SeUpdate seUpdate;
    @JsonProperty private SeMetadataMaintenance seMetadataMaintenance;


    public Map<String, String> getMaintenanceAgency() {
        return maintenanceAgency;
    }

    public void setMaintenanceAgency(Map<String, String> maintenanceAgency) {
        this.maintenanceAgency = maintenanceAgency;
    }

    public SeUpdate getSeUpdate() {
        return seUpdate;
    }
    @Embedded
    public void setSeUpdate(SeUpdate seUpdate) {
        this.seUpdate = seUpdate;
    }

    public SeMetadataMaintenance getSeMetadataMaintenance() {
        return seMetadataMaintenance;
    }
    @Embedded
    public void setSeMetadataMaintenance(SeMetadataMaintenance seMetadataMaintenance) {
        this.seMetadataMaintenance = seMetadataMaintenance;
    }
}
