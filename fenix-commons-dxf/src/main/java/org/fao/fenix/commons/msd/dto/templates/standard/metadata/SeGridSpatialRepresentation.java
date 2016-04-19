package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.export.metadata.*;
import org.fao.fenix.commons.msd.dto.type.CellGeometry;
import org.fao.fenix.commons.msd.dto.type.CellOfOrigin;
import org.fao.fenix.commons.msd.dto.type.XYPosition;

import java.util.Collection;
import java.util.Map;


public class SeGridSpatialRepresentation extends ResponseHandler {

    public SeGridSpatialRepresentation() {}
    public SeGridSpatialRepresentation(Object ... source) {
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
    public Map<String,String> getCellGeometryLabel() {
        CellGeometry value = getCellGeometry();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public CellOfOrigin getCellOfOrigin() {
        return null;
    }
    @JsonProperty
    public Map<String,String> getCellOfOriginLabel() {
        CellOfOrigin value = getCellOfOrigin();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public XYPosition getXyPosition() {
        return null;
    }
    @JsonProperty
    public Map<String,String> getXyPositionLabel() {
        XYPosition value = getXyPosition();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public Collection<SeBand> getMdBand() {
        return  null;
    }
}
