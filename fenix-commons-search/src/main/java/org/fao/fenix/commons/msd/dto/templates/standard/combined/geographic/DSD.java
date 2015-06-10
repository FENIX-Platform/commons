package org.fao.fenix.commons.msd.dto.templates.standard.combined.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDGeographic;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.DSD<DSDGeographic> {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }


}
