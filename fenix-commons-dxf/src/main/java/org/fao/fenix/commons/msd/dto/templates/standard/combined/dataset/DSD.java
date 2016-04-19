package org.fao.fenix.commons.msd.dto.templates.standard.combined.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSDDataset;

public class DSD extends org.fao.fenix.commons.msd.dto.templates.standard.combined.DSD<DSDDataset> {

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
