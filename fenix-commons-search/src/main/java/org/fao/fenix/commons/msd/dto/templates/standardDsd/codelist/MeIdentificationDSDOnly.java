package org.fao.fenix.commons.msd.dto.templates.standardDsd.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDCodelist;

public class MeIdentificationDSDOnly extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDOnly<DSDCodelist> {

    public MeIdentificationDSDOnly() {}
    public MeIdentificationDSDOnly(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDCodelist getDsd() {
        return null;
    }

}
