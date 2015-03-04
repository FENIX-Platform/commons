package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DocumentType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OjCitation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private DocumentType documentKind;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> title;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Date date;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private OjResponsibleParty documentContact;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private Map<String, String> notes;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String link;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String isbn;

    @JsonProperty
    @Label(en="")
    @Description(en="")
    private String issn;


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
