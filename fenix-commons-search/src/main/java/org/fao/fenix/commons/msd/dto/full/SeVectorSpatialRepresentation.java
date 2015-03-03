package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.GeometricObjects;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeVectorSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList topologyLevel;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private GeometricObjects geometricObjects;


    public OjCodeList getTopologyLevel() {
        return topologyLevel;
    }
    @Embedded
    public void setTopologyLevel(OjCodeList topologyLevel) {
        this.topologyLevel = topologyLevel;
    }

    public GeometricObjects getGeometricObjects() {
        return geometricObjects;
    }

    public void setGeometricObjects(GeometricObjects geometricObjects) {
        this.geometricObjects = geometricObjects;
    }
}
