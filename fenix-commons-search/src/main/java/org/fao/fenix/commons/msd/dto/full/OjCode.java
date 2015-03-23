package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class OjCode extends JSONEntity implements Serializable {

    private Code linkedCode;

    @JsonProperty
    @Label(en="Code")
    @Description(en="Alphanumeric sequence of characters that uniquely identify an attribute within a codelist.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String code;

    @JsonProperty
    @Label(en="Label")
    @Description(en="Descriptive term associated to each code within a codelist.")
    @Order(-1)
    @Format(Format.FORMAT.string)
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
