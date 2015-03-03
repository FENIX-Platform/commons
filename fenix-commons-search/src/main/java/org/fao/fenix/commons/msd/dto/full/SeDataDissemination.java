package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class SeDataDissemination extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDistribution seDistribution;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeReleasePolicy seReleasePolicy;


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
