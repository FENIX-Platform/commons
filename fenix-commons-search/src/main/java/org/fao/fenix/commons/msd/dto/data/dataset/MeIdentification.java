package org.fao.fenix.commons.msd.dto.data.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.full.DSDCodelist;
import org.fao.fenix.commons.msd.dto.full.DSDDataset;

public class MeIdentification extends org.fao.fenix.commons.msd.dto.full.MeIdentification {
    @JsonProperty private DSDDataset dsd;

    @Override
    public DSDDataset getDsd() {
        return dsd;
    }

    public void setDsd(DSDDataset dsd) {
        this.dsd = dsd;
    }
}
