package org.fao.fenix.commons.msd.dto.full;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.GeometricObjects;

import java.io.Serializable;

public class OJScale extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Min Scale Factor")
    @Description(en= "Min Scale Factor")
    @Order(1)
    @Format(Format.FORMAT.string)
    private double minScaleFactor;

    @JsonProperty
    @Label(en="Max Scale Factor")
    @Description(en= "Max Scale Factor")
    @Order(2)
    @Format(Format.FORMAT.string)
    private double maxScaleFactor;


    public double getMaxScaleFactor() {
        return maxScaleFactor;
    }

    public void setMaxScaleFactor(double maxScaleFactor) {
        this.maxScaleFactor = maxScaleFactor;
    }

    public double getMinScaleFactor() {
        return minScaleFactor;
    }

    public void setMinScaleFactor(double minScaleFactor) {
        this.minScaleFactor = minScaleFactor;
    }
}
