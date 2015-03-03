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
    @Label(en="")
    @Description(en= "")
    private String referenceSystemIdentifier;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> referenceSystemName;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjResponsibleParty referenceSystemAuthority;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeProjection seProjection;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeEllipsoid seEllipsoid;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
