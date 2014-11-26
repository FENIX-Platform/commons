package org.fao.fenix.commons.msd.dto.templates.standardDsd.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDDataset;

public class MeIdentificationDSDOnly extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDOnly<DSDDataset> {

    public MeIdentificationDSDOnly() {}
    public MeIdentificationDSDOnly(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

}
