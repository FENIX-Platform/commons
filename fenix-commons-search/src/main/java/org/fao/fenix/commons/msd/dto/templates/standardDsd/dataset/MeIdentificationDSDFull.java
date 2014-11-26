package org.fao.fenix.commons.msd.dto.templates.standardDsd.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.dsd.DSDDataset;

public class MeIdentificationDSDFull extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSDFull<DSDDataset> {

    public MeIdentificationDSDFull() {}
    public MeIdentificationDSDFull(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

}
