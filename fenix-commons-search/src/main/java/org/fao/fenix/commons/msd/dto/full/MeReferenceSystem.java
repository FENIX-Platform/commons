package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class MeReferenceSystem extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Identifier of reference system")
    @Description(en= "Identifier of the reference system. One of the most common standards for reference systems is the EPSG Geodetic Parameter Registry, created by the European Petroleum Survey Group.")
    private String referenceSystemIdentifier;

    @JsonProperty
    @Label(en="Extented name of reference system")
    @Description(en= "Alias or the name of the reference system.")
    private Map<String, String> referenceSystemName;

    @JsonProperty
    @Label(en="Reference system authority")
    @Description(en= "It is an element of the type ResponsibleParty providing details on the authority linked to the referece system.")
    private OjResponsibleParty referenceSystemAuthority;

    @JsonProperty
    @Label(en="Projection")
    @Description(en= "This section provides the identifiers of the projection of the considered Coordinate Reference System (CRS).")
    private SeProjection seProjection;

    @JsonProperty
    @Label(en="Ellipsoid")
    @Description(en= "This section provides the identifiers of the ellipsoid of the considered Coordinate Reference System (CRS).")
    private SeEllipsoid seEllipsoid;

    @JsonProperty
    @Label(en="Datum")
    @Description(en= "This section provides the identifiers of the datum of the considered Coordinate Reference System (CRS).")
    private SeDatum seDatum;


    public String getReferenceSystemIdentifier() {
        return referenceSystemIdentifier;
    }

    public void setReferenceSystemIdentifier(String referenceSystemIdentifier) {
        this.referenceSystemIdentifier = referenceSystemIdentifier;
    }

    public Map<String, String> getReferenceSystemName() {
        return referenceSystemName;
    }

    public void setReferenceSystemName(Map<String, String> referenceSystemName) {
        this.referenceSystemName = referenceSystemName;
    }

    public OjResponsibleParty getReferenceSystemAuthority() {
        return referenceSystemAuthority;
    }
    @Embedded
    public void setReferenceSystemAuthority(OjResponsibleParty referenceSystemAuthority) {
        this.referenceSystemAuthority = referenceSystemAuthority;
    }

    public SeProjection getSeProjection() {
        return seProjection;
    }
    @Embedded
    public void setSeProjection(SeProjection seProjection) {
        this.seProjection = seProjection;
    }

    public SeEllipsoid getSeEllipsoid() {
        return seEllipsoid;
    }
    @Embedded
    public void setSeEllipsoid(SeEllipsoid seEllipsoid) {
        this.seEllipsoid = seEllipsoid;
    }

    public SeDatum getSeDatum() {
        return seDatum;
    }
    @Embedded
    public void setSeDatum(SeDatum seDatum) {
        this.seDatum = seDatum;
    }
}
