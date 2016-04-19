package org.fao.fenix.commons.msd.dto.templates.standard.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.DataType;

import java.util.Map;

public class DSDCache extends ResponseHandler {

    public DSDCache() {}
    public DSDCache(Object ... source) {
        super(source);
    }


    @JsonProperty
    public String getManager() {
        return null;
    }

    @JsonProperty
    public String getStorage() {
        return null;
    }
}
