package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.MetadataEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class DSD extends JSONEntity implements Serializable, MetadataEntity {

    @JsonProperty
    private Map<String,Object> contextExtension;

    @JsonProperty
    private String contextSystem;

    @JsonProperty
    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


    @Override
    public boolean isIdentificationOnly() throws IllegalAccessException {
        return (contextExtension==null || contextExtension.size()==0)
                && cache==null
                && (datasources==null || datasources.length==0)
                && (contextSystem==null || contextSystem.trim().length()==0);
    }
}
