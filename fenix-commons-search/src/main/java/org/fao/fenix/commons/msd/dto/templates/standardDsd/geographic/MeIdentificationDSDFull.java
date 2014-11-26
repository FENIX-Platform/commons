package org.fao.fenix.commons.msd.dto.templates.standardDsd.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDGeographic;

public class MeIdentificationDSDFull extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDFull<DSDGeographic> {

    public MeIdentificationDSDFull() {}
    public MeIdentificationDSDFull(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }

}
