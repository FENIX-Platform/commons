package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class OjCode extends JSONEntity implements Serializable {

    private Code linkedCode;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String code;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> label;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    public Code getLinkedCode() {
        return linkedCode;
    }

    public void setLinkedCode(Code linkedCode) {
        this.linkedCode = linkedCode;
    }
}
