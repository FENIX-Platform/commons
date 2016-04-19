package org.fao.fenix.commons.msd.dto.templates.export.combined.document;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.export.combined.DSD<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDocument> {

    public DSD() {}
    public DSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDocument getDsd() {
        return null;
    }

}
