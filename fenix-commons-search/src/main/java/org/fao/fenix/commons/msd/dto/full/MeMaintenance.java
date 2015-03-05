package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeMaintenance extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Maintenance agency")
    @Description(en= "Organization or other expert body that maintains the resource.")
    private Map<String, String> maintenanceAgency;

    @JsonProperty
    @Label(en="Update")
    @Description(en= "This section involves maintenance operations concerning the periodic update of the resource.")
    private SeUpdate seUpdate;

    @JsonProperty
    @Label(en="MAINTENANCE")
    @Description(en= "This section involves maintenance operations concerning the periodic update of metadata to ensure that the resource is properly described.")
    private SeMetadataMaintenance seMetadataMaintenance;


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
