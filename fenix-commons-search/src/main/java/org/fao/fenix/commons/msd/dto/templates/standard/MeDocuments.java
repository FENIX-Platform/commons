package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import java.util.Collection;

public class MeDocuments extends ResponseHandler {

    public MeDocuments() {}
    public MeDocuments(Object source) {
        super(source);
    }


    @JsonProperty
    public OjCitation getDocument() {
        return null;
    }
    @JsonProperty
    public Collection<OjCitation> getAttachments() {
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
