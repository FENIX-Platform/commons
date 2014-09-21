package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class MeResourceStructure extends JSONEntity implements Serializable {

    @JsonProperty private Collection<SeResourceDimensions> seResourceDimensions;
    @JsonProperty private Collection<SeResourceRecords> seResourceRecords;


    public Collection<SeResourceDimensions> getSeResourceDimensions() {
        return seResourceDimensions;
    }
    @Embedded
    public void setSeResourceDimensions(Collection<SeResourceDimensions> seResourceDimensions) {
        this.seResourceDimensions = seResourceDimensions;
    }

    public Collection<SeResourceRecords> getSeResourceRecords() {
        return seResourceRecords;
    }
    @Embedded
    public void setSeResourceRecords(Collection<SeResourceRecords> seResourceRecords) {
        this.seResourceRecords = seResourceRecords;
    }
}
