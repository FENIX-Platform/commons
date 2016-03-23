package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;

public class DSDCache extends JSONEntity implements Serializable {

    @JsonProperty
    private String manager;

    @JsonProperty
    private String storage;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }


    @Override
    public DSDCache clone() {
        DSDCache clone = new DSDCache();
        clone.setManager(getManager());
        clone.setStorage(getStorage());
        return clone;
    }
}
