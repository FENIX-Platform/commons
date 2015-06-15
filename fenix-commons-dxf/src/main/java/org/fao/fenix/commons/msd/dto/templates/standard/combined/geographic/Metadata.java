package org.fao.fenix.commons.msd.dto.templates.standard.combined.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDGeographic;

public class Metadata extends org.fao.fenix.commons.msd.dto.templates.standard.combined.Metadata<DSDGeographic> {

    public Metadata() {}
    public Metadata(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }

}
