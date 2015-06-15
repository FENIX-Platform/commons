package org.fao.fenix.commons.msd.dto.templates.export.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.DataType;

import java.util.Map;

public class DSDColumn extends ResponseHandler {

    public DSDColumn() {}
    public DSDColumn(Object source) {
        super(source);
    }


    @JsonProperty
    public String getId() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getSupplemental() {
        return null;
    }
    @JsonProperty
    public String getSubject() {
        return null;
    }
    @JsonProperty
    public DataType getDataType() {
        return null;
    }
    @JsonProperty
    public DSDDomain getValues() {
        return null;
    }
    @JsonProperty
    public DSDDomain getDomain() {
        return null;
    }
    @JsonProperty
    public String getColumnLink() {
        return null;
    }
    @JsonProperty
    public Boolean getKey() {
        return null;
    }
    @JsonProperty
    public Boolean getTransposed() {
        return null;
    }
    @JsonProperty
    public Boolean getVirtual() {
        return null;
    }
}
