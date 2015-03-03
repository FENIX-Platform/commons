package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class MeDocuments extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCitation document;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private ReferenceEntity referenceEntity;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private String referenceElement;


    public OjCitation getDocument() {
        return document;
    }
    @Embedded
    public void setDocument(OjCitation document) {
        this.document = document;
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
