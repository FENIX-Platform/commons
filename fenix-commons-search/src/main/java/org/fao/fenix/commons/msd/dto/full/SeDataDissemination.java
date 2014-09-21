package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeDataDissemination extends JSONEntity implements Serializable {
    @JsonProperty private SeDistribution seDistribution;
    @JsonProperty private SeReleasePolicy seReleasePolicy;


    public SeReleasePolicy getSeReleasePolicy() {
        return seReleasePolicy;
    }
    @Embedded
    public void setSeReleasePolicy(SeReleasePolicy seReleasePolicy) {
        this.seReleasePolicy = seReleasePolicy;
    }

    public SeDistribution getSeDistribution() {
        return seDistribution;
    }
    @Embedded
    public void setSeDistribution(SeDistribution seDistribution) {
        this.seDistribution = seDistribution;
    }
}
