package org.fao.fenix.commons.msd.dto.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.full.DSD;
import org.fao.fenix.commons.msd.dto.full.MeIdentification;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class Resource <M extends DSD, D> extends JSONEntity implements Serializable {

    @JsonProperty private Collection<D> data;
    @JsonProperty private MeIdentification<M> metadata;


    public Resource() { }

    public Resource(MeIdentification<M> metadata) {
        this.metadata = metadata;
    }

    public Resource(MeIdentification<M> metadata, Collection<D> data) {
        this.data = data;
        this.metadata = metadata;
    }




    public Collection<D> getData() {
        return data;
    }

    public void setData(Collection<D> data) {
        this.data = data;
    }

    public MeIdentification<M> getMetadata() {
        return metadata;
    }

    public void setMetadata(MeIdentification<M> metadata) {
        this.metadata = metadata;
    }

//Utils

    public void addData(D value) {
        if (data==null)
            data = new LinkedList<>();
        data.add(value);
    }

}