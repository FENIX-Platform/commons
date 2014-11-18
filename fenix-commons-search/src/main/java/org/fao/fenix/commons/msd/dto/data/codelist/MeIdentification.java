package org.fao.fenix.commons.msd.dto.data.codelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.full.DSDCodelist;

public class MeIdentification extends org.fao.fenix.commons.msd.dto.full.MeIdentification {
    @JsonProperty private DSDCodelist dsd;

    @Override
    public DSDCodelist getDsd() {
        return dsd;
    }

    public void setDsd(DSDCodelist dsd) {
        this.dsd = dsd;
    }
}
