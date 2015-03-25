package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;

public class MeAccessibility extends JSONEntity implements Serializable {


    
    @JsonProperty
    @Label(en="DATA DISSEMINATION")
    @Description(en= "This section reports the mode of distribution of the resource with a focus on how to access the resource, the supported formats.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private SeDataDissemination seDataDissemination;
    
    @JsonProperty
    @Label(en="Clarity")
    @Description(en= "This section gives information about the availability of additional information (documentation, further metadata. . . ) linked to the resource.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private SeClarity seClarity;
    
    @JsonProperty
    @Label(en="Confidentiality")
    @Description(en= "This section information on the level of confidentiality and the applied policy for releasing the resource. This metadata sub-entity concerns legislation (or any other formal provision) related to statistical confidentiality applied to the resource as well as the actual confidentiality data treatment applied (also with regard to the aggregated data disseminated).")
    @Order(3)
    @Format(Format.FORMAT.string)
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
