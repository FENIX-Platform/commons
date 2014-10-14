package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeProjectionParameters extends JSONEntity implements Serializable {


    @JsonProperty private Integer zone;
    @JsonProperty private Double standardParallel;
    @JsonProperty private Double longitudeOfCentralMeridian;
    @JsonProperty private Double latitudeOfProjectionOrigin;
    @JsonProperty private Double falseEasting;
    @JsonProperty private Double falseNorthing;
    @JsonProperty private OjMeasure falseEastingNorthingUnits;
    @JsonProperty private Double scaleFactorAtEquator;
    @JsonProperty private Double heightOfProspectivePointAboveSurface;
    @JsonProperty private Double longitudeOfProjectionCenter;
    @JsonProperty private Double latitudeOfProjectionCenter;
    @JsonProperty private Double scaleFactorAtCenterLine;
    @JsonProperty private Double straightVerticalLongitudeFromPole;
    @JsonProperty private Double scaleFactorAtProjectionOrigin;

    @JsonProperty private SeObliqueLineAzimuth seObliqueLineAzimuth;
    @JsonProperty private SeObliqueLinePoint seObliqueLinePoint;


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
