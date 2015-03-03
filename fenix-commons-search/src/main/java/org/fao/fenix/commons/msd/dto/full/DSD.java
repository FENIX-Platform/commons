package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class DSD extends JSONEntity implements Serializable {

    @JsonProperty
    private Map<String,Object> contextExtension;

    @JsonProperty
    private String contextSystem;

    @JsonProperty
    private String datasource;


    public String getContextSystem() {
        return contextSystem;
    }

    public void setContextSystem(String contextSystem) {
        this.contextSystem = contextSystem;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public Map<String, Object> getContextExtension() {
        return contextExtension;
    }

    public void setContextExtension(Map<String, Object> contextExtension) {
        this.contextExtension = contextExtension;
    }
}
