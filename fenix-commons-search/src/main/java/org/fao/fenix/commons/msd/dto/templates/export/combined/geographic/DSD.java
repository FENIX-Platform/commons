package org.fao.fenix.commons.msd.dto.templates.export.combined.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.export.combined.DSD<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDGeographic> {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDGeographic getDsd() {
        return null;
    }


}
