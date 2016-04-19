package org.fao.fenix.commons.msd.dto.templates.standard.combined.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDCodelist;

public class MetadataDSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.MetadataDSD<DSDCodelist> {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDCodelist getDsd() {
        return null;
    }

}
