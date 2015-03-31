package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Date;

public class SeMetadataMaintenance extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Metadata last certified",fr="Dernier métadonnées certifiées",es="Metadatos última certificada")
    @Description(en= "Latest date of certification of the metadata.")
    @Order(1)
    @Format(Format.FORMAT.date)
    private Date metadataLastCertified;

    @JsonProperty
    @Label(en="Metadata last posted",fr="Dernier métadonnées telechargées",es="Metadatos último publicado")
    @Description(en= "Latest date of publication of the metadata. It is usually automatically updated by the metadata production system.")
    @Order(2)
    @Format(Format.FORMAT.date)
    private Date metadataLastPosted;

    @JsonProperty
    @Label(en="Metadata last update",fr="Dernier métadonnées mises à jour",es="Metadatos última actualización")
    @Description(en= "Most recent date of update of the metadata.")
    @Order(3)
    @Format(Format.FORMAT.date)
    private Date metadataLastUpdate;


    public Date getMetadataLastCertified() {
        return metadataLastCertified;
    }

    public void setMetadataLastCertified(Date metadataLastCertified) {
        this.metadataLastCertified = metadataLastCertified;
    }

    public Date getMetadataLastPosted() {
        return metadataLastPosted;
    }

    public void setMetadataLastPosted(Date metadataLastPosted) {
        this.metadataLastPosted = metadataLastPosted;
    }

    public Date getMetadataLastUpdate() {
        return metadataLastUpdate;
    }

    public void setMetadataLastUpdate(Date metadataLastUpdate) {
        this.metadataLastUpdate = metadataLastUpdate;
    }
}
