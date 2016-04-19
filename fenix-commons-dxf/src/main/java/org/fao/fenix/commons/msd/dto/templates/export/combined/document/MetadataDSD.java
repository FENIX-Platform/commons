package org.fao.fenix.commons.msd.dto.templates.export.combined.document;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataDSD extends org.fao.fenix.commons.msd.dto.templates.export.combined.MetadataDSD<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDocument> {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDocument getDsd() {
        return null;
    }

}
