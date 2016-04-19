package org.fao.fenix.commons.msd.dto.templates.standard.combined.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDGeographic;

public class MetadataDSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.MetadataDSD<DSDGeographic> {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDGeographic getDsd() {
        return null;
    }

}
