package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeAccessibility extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeDataDissemination seDataDissemination;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeClarity seClarity;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private SeConfidentiality seConfidentiality;


    public SeDataDissemination getSeDataDissemination() {
        return seDataDissemination;
    }
    @Embedded
    public void setSeDataDissemination(SeDataDissemination seDataDissemination) {
        this.seDataDissemination = seDataDissemination;
    }

    public SeClarity getSeClarity() {
        return seClarity;
    }
    @Embedded
    public void setSeClarity(SeClarity seClarity) {
        this.seClarity = seClarity;
    }

    public SeConfidentiality getSeConfidentiality() {
        return seConfidentiality;
    }
    @Embedded
    public void setSeConfidentiality(SeConfidentiality seConfidentiality) {
        this.seConfidentiality = seConfidentiality;
    }
}
