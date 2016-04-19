package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import java.util.Map;

public class MeDocuments extends ResponseHandler {

    public MeDocuments() {}
    public MeDocuments(Object ... source) {
        super(source);
    }


    @JsonProperty
    public OjCitation getDocument() {
        return null;
    }
    @JsonProperty
    public ReferenceEntity getReferenceEntity() {
        return null;
    }
    @JsonProperty
    public Map<String,String> getReferenceEntityLabel() {
        ReferenceEntity value = getReferenceEntity();
        return value!=null ? value.getLabel() : null;
    }

    @JsonProperty
    public String getReferenceElement() {
        return null;
    }
}
