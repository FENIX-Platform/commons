package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;

import java.io.Serializable;
import java.util.Collection;

public class CodeList extends JSONdto implements Serializable {

    @JsonProperty private MeIdentification metadata;
    @JsonProperty private Collection<Code> data;


    public CodeList() { }
    public CodeList(MeIdentification metadata, Collection<Code> data) {
        this.metadata = metadata;
        this.data = data;
    }

    public MeIdentification getMetadata() {
        return metadata;
    }

    public void setMetadata(MeIdentification metadata) {
        this.metadata = metadata;
    }

    public Collection<Code> getData() {
        return data;
    }

    public void setData(Collection<Code> data) {
        this.data = data;
    }
}
