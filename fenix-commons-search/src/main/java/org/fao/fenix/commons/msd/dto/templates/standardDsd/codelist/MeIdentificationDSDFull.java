package org.fao.fenix.commons.msd.dto.templates.standardDsd.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDCodelist;

public class MeIdentificationDSDFull extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDFull<DSDCodelist> {

    public MeIdentificationDSDFull() {}
    public MeIdentificationDSDFull(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDCodelist getDsd() {
        return null;
    }

}
