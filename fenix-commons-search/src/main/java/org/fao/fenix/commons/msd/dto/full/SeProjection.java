package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeProjection extends JSONEntity implements Serializable {

    @JsonProperty private OjCodeList projection;
    @JsonProperty private Map<String, String> projectionName;

    @JsonProperty private SeProjectionParameters seProjectionParameters;


    public OjCodeList getProjection() {
        return projection;
    }
    @Embedded
    public void setProjection(OjCodeList projection) {
        this.projection = projection;
    }

    public Map<String, String> getProjectionName() {
        return projectionName;
    }

    public void setProjectionName(Map<String, String> projectionName) {
        this.projectionName = projectionName;
    }

    public SeProjectionParameters getSeProjectionParameters() {
        return seProjectionParameters;
    }
    @Embedded
    public void setSeProjectionParameters(SeProjectionParameters seProjectionParameters) {
        this.seProjectionParameters = seProjectionParameters;
    }
}
