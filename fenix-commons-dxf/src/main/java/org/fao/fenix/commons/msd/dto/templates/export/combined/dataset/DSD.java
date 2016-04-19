package org.fao.fenix.commons.msd.dto.templates.export.combined.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDataset;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.export.combined.DSD<org.fao.fenix.commons.msd.dto.templates.export.dsd.DSDDataset> {

    public DSD() {}
    public DSD(Object ... source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

}
