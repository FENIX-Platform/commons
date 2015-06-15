package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import java.util.Map;

public class MeDocuments extends ResponseHandler {

    public MeDocuments() {}
    public MeDocuments(Object source) {
        super(source);
    }


    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCitation getDocument() {
        return null;
    }
    @JsonProperty
    public ReferenceEntity getReferenceEntity() {
        return null;
    }


    @JsonProperty
    public String getReferenceElement() {
        return null;
    }
}
