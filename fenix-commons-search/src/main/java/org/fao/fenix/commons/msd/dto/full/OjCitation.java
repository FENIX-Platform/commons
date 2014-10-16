package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DocumentType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OjCitation extends JSONEntity implements Serializable {

    @JsonProperty private DocumentType documentKind;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Date date;
    @JsonProperty private OjResponsibleParty documentContact;
    @JsonProperty private Map<String, String> notes;
    @JsonProperty private String link;
    @JsonProperty private String isbn;
    @JsonProperty private String issn;


    public DocumentType getDocumentKind() {
        return documentKind;
    }

    public void setDocumentKind(DocumentType documentKind) {
        this.documentKind = documentKind;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OjResponsibleParty getDocumentContact() {
        return documentContact;
    }
    @Embedded
    public void setDocumentContact(OjResponsibleParty documentContact) {
        this.documentContact = documentContact;
    }

    public Map<String, String> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, String> notes) {
        this.notes = notes;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
