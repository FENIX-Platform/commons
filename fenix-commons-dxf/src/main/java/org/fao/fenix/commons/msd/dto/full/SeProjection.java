package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeProjection extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Projection")
    @Description(en= "Identifier of the projection used.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private OjCodeList projection;

    @JsonProperty
    @Label(en="Name of projection")
    @Description(en= "Name of the projection used contains the set of parameters that describe the projection.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> projectionName;

    @JsonProperty
    @Label(en="PROJECTION PARAMETERS")
    @Description(en= "This section contains the set of parameters that describe the projection.")
    @Order(3)
    @Format(Format.FORMAT.string)
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
