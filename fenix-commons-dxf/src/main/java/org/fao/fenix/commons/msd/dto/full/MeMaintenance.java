package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class MeMaintenance extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Maintenance agency",fr="Agence de Maintenance",es="Agencia de Mantenimiento")
    @Description(en= "Organization or other expert body that maintains the resource.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Map<String, String> maintenanceAgency;

    @JsonProperty
    @Label(en="Update",fr="Mise à jour",es="Actualización")
    @Description(en= "This section involves maintenance operations concerning the periodic update of the resource.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private SeUpdate seUpdate;

    @JsonProperty
    @Label(en="Metadata Maintenance",fr="Maintenance des Métadonnées",es="Mantenimiento de metadatos")
    @Description(en= "This section involves maintenance operations concerning the periodic update of metadata to ensure that the resource is properly described.")
    @Order(3)
    @Format(Format.FORMAT.string)
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
