package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeProjection extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Projection")
    @Description(en= "Iidentifier of the projection used.")
    private OjCodeList projection;

    @JsonProperty
    @Label(en="Name of projection")
    @Description(en= "Name of the projection used contains the set of parameters that describe the projection.")
    private Map<String, String> projectionName;

    @JsonProperty
    @Label(en="PROJECTION PARAMETERS")
    @Description(en= "This section contains the set of parameters that describe the projection.")
    private SeProjectionParameters seProjectionParameters;


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
