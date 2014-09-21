package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class MeDocuments extends JSONEntity implements Serializable {
    @JsonProperty private OjCitation document;
    @JsonProperty private Collection<OjCitation> attachments;
    @JsonProperty private ReferenceEntity referenceEntity;
    @JsonProperty private String referenceElement;


    public OjCitation getDocument() {
        return document;
    }
    @Embedded
    public void setDocument(OjCitation document) {
        this.document = document;
    }

    public Collection<OjCitation> getAttachments() {
        return attachments;
    }
    @Embedded
    public void setAttachments(Collection<OjCitation> attachments) {
        this.attachments = attachments;
    }

    public ReferenceEntity getReferenceEntity() {
        return referenceEntity;
    }

    public void setReferenceEntity(ReferenceEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
    }

    public String getReferenceElement() {
        return referenceElement;
    }

    public void setReferenceElement(String referenceElement) {
        this.referenceElement = referenceElement;
    }
}
