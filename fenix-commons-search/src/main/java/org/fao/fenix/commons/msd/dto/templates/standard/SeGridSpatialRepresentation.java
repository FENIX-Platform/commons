package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.CellGeometry;
import org.fao.fenix.commons.msd.dto.type.CellOfOrigin;
import org.fao.fenix.commons.msd.dto.type.XYPosition;


public class SeGridSpatialRepresentation extends ResponseHandler {

    public SeGridSpatialRepresentation() {}
    public SeGridSpatialRepresentation(Object source) {
        super(source);
    }



    @JsonProperty
    public Integer getNumberOfDimensions() {
        return null;
    }
    @JsonProperty
    public OjAxis getAxisDimensionProperties() {
        return null;
    }
    @JsonProperty
    public CellGeometry getCellGeometry() {
        return null;
    }
    @JsonProperty
    public CellOfOrigin getCellOfOrigin() {
        return null;
    }
    @JsonProperty
    public XYPosition getXyPosition() {
        return null;
    }

}
