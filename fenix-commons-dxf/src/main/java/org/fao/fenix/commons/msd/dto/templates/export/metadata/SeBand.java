package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

public class SeBand  extends ResponseHandler {

    public SeBand() {}
    public SeBand(Object ... source) {
        super(source);
    }

    @JsonProperty
    public Double getMaxValue() {
        return null;
    }
    @JsonProperty
    public Double getMinValue() {
        return null;
    }
    @JsonProperty
    public Integer getBitsterValue() {
        return null;
    }
    @JsonProperty
    public Double getScaleFactor() {
        return null;
    }
    @JsonProperty
    public Double getOffset() {
        return null;
    }
}
