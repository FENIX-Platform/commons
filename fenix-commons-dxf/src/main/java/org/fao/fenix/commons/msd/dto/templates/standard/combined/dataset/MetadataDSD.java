package org.fao.fenix.commons.msd.dto.templates.standard.combined.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDDataset;

public class MetadataDSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.MetadataDSD<DSDDataset> {

    public MetadataDSD() {}
    public MetadataDSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

}
