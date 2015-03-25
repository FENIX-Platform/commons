package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeProjectionParameters extends JSONEntity implements Serializable {


    @JsonProperty
    @Label(en="Zone")
    @Description(en= "Unique identifier for 100,000-meter grid zone.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Integer zone;

    @JsonProperty
    @Label(en="Standard parallel")
    @Description(en= "Line of constant latitude where the projection surface intersects the earth.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Double standardParallel;

    @JsonProperty
    @Label(en="Longitude of central meridian")
    @Description(en= "Line of longitude at the center of a map projection generally used as the basis for constructing the projection.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private Double longitudeOfCentralMeridian;

    @JsonProperty
    @Label(en="Latitude of projection origin")
    @Description(en= "Latitude chosen as the origin of the coordinates for a map projection.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private Double latitudeOfProjectionOrigin;

    @JsonProperty
    @Label(en="False easting")
    @Description(en= "Value added to all 'x' values to the coordinates for a map projection. It is expressed in the unit of measure identified in Planar Coordinate Unit.")
    @Order(5)
    @Format(Format.FORMAT.string)
    private Double falseEasting;

    @JsonProperty
    @Label(en="False northing")
    @Description(en= "Value added to all 'y' values to the coordinates for a map projection. This value frequently is assigned to eliminate negative numbers. It is expressed in the unit of measure identified in Planar Coordinates Units.")
    @Order(6)
    @Format(Format.FORMAT.string)
    private Double falseNorthing;

    @JsonProperty
    @Label(en="Unit of measure of false easting/northing")
    @Description(en= "Unit of the falseEasting and falseNorthing.")
    @Order(7)
    @Format(Format.FORMAT.string)
    private OjMeasure falseEastingNorthingUnits;

    @JsonProperty
    @Label(en="Scale factor at the equator")
    @Description(en= "Ratio between the distance on earth and the corresponding map distance, along the equator.")
    @Order(8)
    @Format(Format.FORMAT.string)
    private Double scaleFactorAtEquator;

    @JsonProperty
    @Label(en="Height of view point above the Earth (m)")
    @Description(en= "Height of viewpoint above the Earth expressed in meters.")
    @Order(9)
    @Format(Format.FORMAT.string)
    private Double heightOfProspectivePointAboveSurface;

    @JsonProperty
    @Label(en="Longitude of projection centre")
    @Description(en= "Longitude of the point of projection for azimuthal projections.")
    @Order(10)
    @Format(Format.FORMAT.string)
    private Double longitudeOfProjectionCenter;

    @JsonProperty
    @Label(en="Latitude of projection center")
    @Description(en= "Latitude of the point of projection for azimuthal projections.")
    @Order(11)
    @Format(Format.FORMAT.string)
    private Double latitudeOfProjectionCenter;

    @JsonProperty
    @Label(en="Scale factor at center line")
    @Description(en= "Ratio between distance on earth and the corresponding map distance, along the center line.")
    @Order(12)
    @Format(Format.FORMAT.string)
    private Double scaleFactorAtCenterLine;

    @JsonProperty
    @Label(en="Straight vertical longitude from pole")
    @Description(en= "Longitude to be oriented straight up from the North Pole.")
    @Order(13)
    @Format(Format.FORMAT.string)
    private Double straightVerticalLongitudeFromPole;

    @JsonProperty
    @Label(en="Scale factor at projection origin")
    @Description(en= "Multiplier for reducing a distance obtained from a map by computation or scaling to the actual distance at the projection origin.")
    @Order(14)
    @Format(Format.FORMAT.string)
    private Double scaleFactorAtProjectionOrigin;

    @JsonProperty
    @Label(en="Oblique Line Azimuth")
    @Description(en= "Method used to describe the line along which an oblique Mercator map projection is centred using the map projection origin and an azimuth.")
    @Order(15)
    @Format(Format.FORMAT.string)
    private SeObliqueLineAzimuth seObliqueLineAzimuth;

    @JsonProperty
    @Label(en="Oblique Line Point")
    @Description(en= "Method used to describe the line along which an oblique mercator map projection is centred using two points near the limit of the mapped region that define the centre line.")
    @Order(16)
    @Format(Format.FORMAT.string)
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
