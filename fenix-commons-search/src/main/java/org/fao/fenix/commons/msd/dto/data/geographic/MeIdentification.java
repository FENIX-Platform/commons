package org.fao.fenix.commons.msd.dto.data.geographic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.full.DSDGeographic;

public class MeIdentification extends org.fao.fenix.commons.msd.dto.full.MeIdentification {
    @JsonProperty private DSDGeographic dsd;

    @Override
    public DSDGeographic getDsd() {
        return dsd;
    }

    public void setDsd(DSDGeographic dsd) {
        this.dsd = dsd;
    }
}
