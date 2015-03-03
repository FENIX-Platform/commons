package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeProjectionParameters extends JSONEntity implements Serializable {


    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Integer zone;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double standardParallel;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double longitudeOfCentralMeridian;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double latitudeOfProjectionOrigin;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double falseEasting;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double falseNorthing;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjMeasure falseEastingNorthingUnits;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double scaleFactorAtEquator;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double heightOfProspectivePointAboveSurface;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double longitudeOfProjectionCenter;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double latitudeOfProjectionCenter;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double scaleFactorAtCenterLine;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double straightVerticalLongitudeFromPole;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double scaleFactorAtProjectionOrigin;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeObliqueLineAzimuth seObliqueLineAzimuth;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeObliqueLinePoint seObliqueLinePoint;


    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public Double getStandardParallel() {
        return standardParallel;
    }

    public void setStandardParallel(Double standardParallel) {
        this.standardParallel = standardParallel;
    }

    public Double getLongitudeOfCentralMeridian() {
        return longitudeOfCentralMeridian;
    }

    public void setLongitudeOfCentralMeridian(Double longitudeOfCentralMeridian) {
        this.longitudeOfCentralMeridian = longitudeOfCentralMeridian;
    }

    public Double getLatitudeOfProjectionOrigin() {
        return latitudeOfProjectionOrigin;
    }

    public void setLatitudeOfProjectionOrigin(Double latitudeOfProjectionOrigin) {
        this.latitudeOfProjectionOrigin = latitudeOfProjectionOrigin;
    }

    public Double getFalseEasting() {
        return falseEasting;
    }

    public void setFalseEasting(Double falseEasting) {
        this.falseEasting = falseEasting;
    }

    public Double getFalseNorthing() {
        return falseNorthing;
    }

    public void setFalseNorthing(Double falseNorthing) {
        this.falseNorthing = falseNorthing;
    }

    public OjMeasure getFalseEastingNorthingUnits() {
        return falseEastingNorthingUnits;
    }
    @Embedded
    public void setFalseEastingNorthingUnits(OjMeasure falseEastingNorthingUnits) {
        this.falseEastingNorthingUnits = falseEastingNorthingUnits;
    }

    public Double getScaleFactorAtEquator() {
        return scaleFactorAtEquator;
    }

    public void setScaleFactorAtEquator(Double scaleFactorAtEquator) {
        this.scaleFactorAtEquator = scaleFactorAtEquator;
    }

    public Double getHeightOfProspectivePointAboveSurface() {
        return heightOfProspectivePointAboveSurface;
    }

    public void setHeightOfProspectivePointAboveSurface(Double heightOfProspectivePointAboveSurface) {
        this.heightOfProspectivePointAboveSurface = heightOfProspectivePointAboveSurface;
    }

    public Double getLongitudeOfProjectionCenter() {
        return longitudeOfProjectionCenter;
    }

    public void setLongitudeOfProjectionCenter(Double longitudeOfProjectionCenter) {
        this.longitudeOfProjectionCenter = longitudeOfProjectionCenter;
    }

    public Double getLatitudeOfProjectionCenter() {
        return latitudeOfProjectionCenter;
    }

    public void setLatitudeOfProjectionCenter(Double latitudeOfProjectionCenter) {
        this.latitudeOfProjectionCenter = latitudeOfProjectionCenter;
    }

    public Double getScaleFactorAtCenterLine() {
        return scaleFactorAtCenterLine;
    }

    public void setScaleFactorAtCenterLine(Double scaleFactorAtCenterLine) {
        this.scaleFactorAtCenterLine = scaleFactorAtCenterLine;
    }

    public Double getStraightVerticalLongitudeFromPole() {
        return straightVerticalLongitudeFromPole;
    }

    public void setStraightVerticalLongitudeFromPole(Double straightVerticalLongitudeFromPole) {
        this.straightVerticalLongitudeFromPole = straightVerticalLongitudeFromPole;
    }

    public Double getScaleFactorAtProjectionOrigin() {
        return scaleFactorAtProjectionOrigin;
    }

    public void setScaleFactorAtProjectionOrigin(Double scaleFactorAtProjectionOrigin) {
        this.scaleFactorAtProjectionOrigin = scaleFactorAtProjectionOrigin;
    }

    public SeObliqueLineAzimuth getSeObliqueLineAzimuth() {
        return seObliqueLineAzimuth;
    }
    @Embedded
    public void setSeObliqueLineAzimuth(SeObliqueLineAzimuth seObliqueLineAzimuth) {
        this.seObliqueLineAzimuth = seObliqueLineAzimuth;
    }

    public SeObliqueLinePoint getSeObliqueLinePoint() {
        return seObliqueLinePoint;
    }
    @Embedded
    public void setSeObliqueLinePoint(SeObliqueLinePoint seObliqueLinePoint) {
        this.seObliqueLinePoint = seObliqueLinePoint;
    }
}
