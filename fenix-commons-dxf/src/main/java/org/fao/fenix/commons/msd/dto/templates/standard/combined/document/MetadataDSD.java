package org.fao.fenix.commons.msd.dto.templates.standard.combined.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDDocument;

public class MetadataDSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.MetadataDSD<DSDDocument> {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDocument getDsd() {
        return null;
    }

}
