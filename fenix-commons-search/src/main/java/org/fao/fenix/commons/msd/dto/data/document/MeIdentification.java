package org.fao.fenix.commons.msd.dto.data.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.full.DSDCodelist;
import org.fao.fenix.commons.msd.dto.full.DSDDocument;

public class MeIdentification extends org.fao.fenix.commons.msd.dto.full.MeIdentification {
    @JsonProperty private DSDDocument dsd;

    @Override
    public DSDDocument getDsd() {
        return dsd;
    }

    public void setDsd(DSDDocument dsd) {
        this.dsd = dsd;
    }
}
