package org.fao.fenix.commons.msd.dto.templates.standardDsd.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDDocument;

public class MeIdentificationDSDOnly extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDOnly<DSDDocument> {

    public MeIdentificationDSDOnly() {}
    public MeIdentificationDSDOnly(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
