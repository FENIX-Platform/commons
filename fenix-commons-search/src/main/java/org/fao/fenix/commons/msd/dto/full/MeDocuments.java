package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ReferenceEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;

public class MeDocuments extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Documents linked to the data")
    @Description(en= "Regular or ad-hoc publications linked to the resource.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjCitation document;

    @JsonProperty
    @Label(en="Reference subject")
    @Description(en= "The metadata entity(ies) the document refers to. This element allows users to contextualize the document by making reference to specific metadata areas.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private ReferenceEntity referenceEntity;

    @JsonProperty
    @Label(en="Reference element")
    @Description(en= "The metadata element(s)the document refers to. This element allows users to contextualize the document by making reference to specific metadata element(s). The element(s) selected must belong to the metadata entity just specified in <<referenceEntity>>.")
    @Order(-1)
    @Format(Format.FORMAT.string)
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
