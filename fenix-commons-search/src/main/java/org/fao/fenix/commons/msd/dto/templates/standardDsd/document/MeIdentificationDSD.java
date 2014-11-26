package org.fao.fenix.commons.msd.dto.templates.standardDsd.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDDocument;

public class MeIdentificationDSD extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSD<DSDDocument> {

    public MeIdentificationDSD() {}
    public MeIdentificationDSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
