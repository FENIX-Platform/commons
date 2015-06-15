package org.fao.fenix.commons.msd.dto.templates.standard.combined.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDCodelist;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.DSD<DSDCodelist> {

    public DSD() {}
    public DSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDCodelist getDsd() {
        return null;
    }

}
