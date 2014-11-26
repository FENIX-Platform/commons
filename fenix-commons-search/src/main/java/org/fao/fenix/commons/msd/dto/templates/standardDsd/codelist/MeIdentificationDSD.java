package org.fao.fenix.commons.msd.dto.templates.standardDsd.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDCodelist;

public class MeIdentificationDSD extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSD<DSDCodelist> {

    public MeIdentificationDSD() {}
    public MeIdentificationDSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDCodelist getDsd() {
        return null;
    }

}
