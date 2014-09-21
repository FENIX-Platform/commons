package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeEllipsoid extends JSONEntity implements Serializable {

    @JsonProperty private OjCodeList ellipsoid;
    @JsonProperty private Map<String, String> ellipsoidName;

    @JsonProperty private SeEllipsoidParameters seEllipsoidParameters;


    public OjCodeList getEllipsoid() {
        return ellipsoid;
    }
    @Embedded
    public void setEllipsoid(OjCodeList ellipsoid) {
        this.ellipsoid = ellipsoid;
    }

    public Map<String, String> getEllipsoidName() {
        return ellipsoidName;
    }

    public void setEllipsoidName(Map<String, String> ellipsoidName) {
        this.ellipsoidName = ellipsoidName;
    }

    public SeEllipsoidParameters getSeEllipsoidParameters() {
        return seEllipsoidParameters;
    }
    @Embedded
    public void setSeEllipsoidParameters(SeEllipsoidParameters seEllipsoidParameters) {
        this.seEllipsoidParameters = seEllipsoidParameters;
    }
}
