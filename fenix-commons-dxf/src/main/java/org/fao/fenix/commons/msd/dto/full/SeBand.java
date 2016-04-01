package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class SeBand extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Max Value")
    @Description(en="Max Value")
    @Order(1)
    @Format(Format.FORMAT.string)
    private double maxValue;

    @JsonProperty
    @Label(en="Min Value")
    @Description(en="Min Value")
    @Order(2)
    @Format(Format.FORMAT.string)
    private double minValue;

    @JsonProperty
    @Label(en="Bitster Value")
    @Description(en="Bitster Value")
    @Order(3)
    @Format(Format.FORMAT.string)
    private int bitsterValue;

    @JsonProperty
    @Label(en="Scale Factor")
    @Description(en="Scale Factor")
    @Order(4)
    @Format(Format.FORMAT.string)
    private double scaleFactor;


    @JsonProperty
    @Label(en="Offset")
    @Description(en="Offset")
    @Order(5)
    @Format(Format.FORMAT.string)
    private double offset;


    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public int getBitsterValue() {
        return bitsterValue;
    }

    public void setBitsterValue(int bitsterValue) {
        this.bitsterValue = bitsterValue;
    }

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }
}
