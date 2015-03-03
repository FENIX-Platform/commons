package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class MeResourceStructure extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Collection<SeResourceDimensions> seResourceDimensions;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Collection<SeResourceRecords> seResourceRecords;


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
