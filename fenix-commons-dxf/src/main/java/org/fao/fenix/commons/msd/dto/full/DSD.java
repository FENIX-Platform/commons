package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class DSD extends JSONEntity implements Serializable {

    @JsonProperty
    private Map<String,Object> contextExtension;

    @JsonProperty
    private String contextSystem;

    @JsonProperty
    private String[] datasources;

    @JsonProperty
    private DSDCache cache;


    public String getContextSystem() {
        return contextSystem;
    }

    public void setContextSystem(String contextSystem) {
        this.contextSystem = contextSystem;
    }

    public String[] getDatasources() {
        return datasources;
    }

    public void setDatasources(String[] datasources) {
        this.datasources = datasources;
    }

    public Map<String, Object> getContextExtension() {
        return contextExtension;
    }

    public void setContextExtension(Map<String, Object> contextExtension) {
        this.contextExtension = contextExtension;
    }

    public DSDCache getCache() {
        return cache;
    }
    @Embedded
    public void setCache(DSDCache cache) {
        this.cache = cache;
    }
}
