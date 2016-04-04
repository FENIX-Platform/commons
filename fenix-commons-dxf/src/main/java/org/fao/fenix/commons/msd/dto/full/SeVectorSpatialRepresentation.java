package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.GeometricObjects;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeVectorSpatialRepresentation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Degree of complexity of the spatial relationships")
    @Description(en= "Degree of complexity of the spatial relationships expressed through a code list.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private OjCodeList topologyLevel;

    @JsonProperty
    @Label(en="Geometric object")
    @Description(en= "Information about the geometric objects used in the dataset (e.g. point, line, polygon, etc.) expressed through a multipleChoice.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private GeometricObjects geometricObjects;

    @JsonProperty
    @Label(en="Map Unit")
    @Description(en= "Map Unit")
    @Order(3)
    @Format(Format.FORMAT.string)
    private OjCodeList mapUnit;

    @JsonProperty
    @Label(en="Scale Range")
    @Description(en= "Scale Range")
    @Order(4)
    @Format(Format.FORMAT.string)
    private OjScale scaleRange;


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

    public OjCodeList getMapUnit() {
        return mapUnit;
    }

    @Embedded
    public void setMapUnit(OjCodeList mapUnit) {
        this.mapUnit = mapUnit;
    }

    public OjScale getScaleRange() {
        return scaleRange;
    }

    @Embedded
    public void setScaleRange(OjScale scaleRange) {
        this.scaleRange = scaleRange;
    }
}
