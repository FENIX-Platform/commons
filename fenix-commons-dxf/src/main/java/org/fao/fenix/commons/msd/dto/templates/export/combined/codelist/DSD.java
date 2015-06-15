package org.fao.fenix.commons.msd.dto.templates.export.combined.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.export.combined.DSD<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDCodelist> {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDCodelist getDsd() {
        return null;
    }

}
