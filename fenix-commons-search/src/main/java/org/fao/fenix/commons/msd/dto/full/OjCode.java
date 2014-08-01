package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class OjCode extends JSONEntity implements Serializable {
    private Code linkedCode;
    @JsonProperty private String code;
    @JsonProperty private Map<String, String> title;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }

    public Code getLinkedCode() {
        return linkedCode;
    }

    public void setLinkedCode(Code linkedCode) {
        this.linkedCode = linkedCode;
    }
}
