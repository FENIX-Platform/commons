package org.fao.fenix.commons.msd.dto.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.full.MeIdentification;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class Resource <T> extends JSONEntity implements Serializable {

    @JsonProperty
    private MeIdentification metadata;
    @JsonProperty
    private Collection<T> data;


    public Resource() { }

    public Resource(MeIdentification metadata, Collection<T> data) {
        this.metadata = metadata;
        this.data = data;
    }

    public MeIdentification getMetadata() {
        return metadata;
    }

    public void setMetadata(MeIdentification metadata) {
        this.metadata = metadata;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }


    //Utils

    public void addData(T value) {
        if (data==null)
            data = new LinkedList<>();
        data.add(value);
    }

}