package org.fao.fenix.commons.msd.dto.templates.standard.combined.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDDocument;

public class Metadata extends org.fao.fenix.commons.msd.dto.templates.standard.combined.Metadata<DSDDocument> {

    public Metadata() {}
    public Metadata(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
