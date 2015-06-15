package org.fao.fenix.commons.msd.dto.data;

import org.fao.fenix.commons.find.dto.filter.StandardFilter;
import org.fao.fenix.commons.msd.dto.full.DSD;
import org.fao.fenix.commons.msd.dto.full.MeIdentification;

public class ReplicationFilter<M extends DSD> {

    private StandardFilter filter;
    private MeIdentification<M> metadata;



    public StandardFilter getFilter() {
        return filter;
    }

    public void setFilter(StandardFilter filter) {
        this.filter = filter;
    }

    public MeIdentification<M> getMetadata() {
        return metadata;
    }

    public void setMetadata(MeIdentification<M> metadata) {
        this.metadata = metadata;
    }
}
