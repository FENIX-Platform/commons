package org.fao.fenix.commons.msd.dto.templates.standardDsd.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDGeographic;

public class MeIdentificationDSD extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSD<DSDGeographic> {

    public MeIdentificationDSD() {}
    public MeIdentificationDSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }

}
