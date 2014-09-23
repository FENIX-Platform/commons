package org.fao.fenix.commons.msd.dto.templates.standard;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;


public class SeProjectionParameters extends ResponseHandler {

    public SeProjectionParameters() {}
    public SeProjectionParameters(Object source) {
        super(source);
    }



    @JsonProperty
    public Integer getZone() {
        return null;
    }
    @JsonProperty
    public Double getStandardParallel() {
        return null;
    }
    @JsonProperty
    public Double getLongitudeOfCentralMeridian() {
        return null;
    }
    @JsonProperty
    public Double getLatitudeOfProjectionOrigin() {
        return null;
    }
    @JsonProperty
    public Double getFalseEasting() {
        return null;
    }
    @JsonProperty
    public Double getFalseNorthing() {
        return null;
    }
    @JsonProperty
    public OjMeasure getFalseEastingNorthingUnits() {
        return null;
    }
    @JsonProperty
    public Double getScaleFactorAtEquator() {
        return null;
    }
    @JsonProperty
    public Double getHeightOfProspectivePointAboveSurface() {
        return null;
    }
    @JsonProperty
    public Double getLongitudeOfProjectionCenter() {
        return null;
    }
    @JsonProperty
    public Double getLatitudeOfProjectionCenter() {
        return null;
    }
    @JsonProperty
    public Double getScaleFactorAtCenterLine() {
        return null;
    }
    @JsonProperty
    public Double getStraightVerticalLongitudeFromPole() {
        return null;
    }
    @JsonProperty
    public Double getScaleFactorAtProjectionOrigin() {
        return null;
    }
    @JsonProperty
    public SeObliqueLineAzimuth getSeObliqueLineAzimuth() {
        return null;
    }
    @JsonProperty
    public SeObliqueLinePoint getSeObliqueLinePoint() {
        return null;
    }

}
