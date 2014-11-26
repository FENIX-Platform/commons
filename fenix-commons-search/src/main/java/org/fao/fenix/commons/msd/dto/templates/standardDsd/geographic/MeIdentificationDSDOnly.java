package org.fao.fenix.commons.msd.dto.templates.standardDsd.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDGeographic;

public class MeIdentificationDSDOnly extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDOnly<DSDGeographic> {

    public MeIdentificationDSDOnly() {}
    public MeIdentificationDSDOnly(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }


}
