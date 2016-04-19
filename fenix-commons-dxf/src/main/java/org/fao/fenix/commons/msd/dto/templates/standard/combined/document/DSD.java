package org.fao.fenix.commons.msd.dto.templates.standard.combined.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDDocument;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.DSD<DSDDocument> {

    public DSD() {}
    public DSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
