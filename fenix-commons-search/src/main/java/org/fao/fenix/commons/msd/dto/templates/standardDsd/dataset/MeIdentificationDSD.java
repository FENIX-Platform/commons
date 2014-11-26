package org.fao.fenix.commons.msd.dto.templates.standardDsd.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDDataset;

public class MeIdentificationDSD extends org.fao.fenix.commons.msd.dto.templates.standardDsd.MeIdentificationDSD<DSDDataset> {

    public MeIdentificationDSD() {}
    public MeIdentificationDSD(Object source) {
        super(source);
    }

    @Override
    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

}
