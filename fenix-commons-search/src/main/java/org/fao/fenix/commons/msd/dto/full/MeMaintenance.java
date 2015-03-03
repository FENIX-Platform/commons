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
    @Label(en="")
    @Description(en= "")
    private Map<String, String> maintenanceAgency;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeUpdate seUpdate;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
