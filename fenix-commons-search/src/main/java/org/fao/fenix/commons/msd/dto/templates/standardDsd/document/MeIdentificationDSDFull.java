package org.fao.fenix.commons.msd.dto.templates.standardDsd.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDDocument;

public class MeIdentificationDSDFull extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDFull<DSDDocument> {

    public MeIdentificationDSDFull() {}
    public MeIdentificationDSDFull(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
