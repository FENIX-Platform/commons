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
    @Label(en="Kind of document")
    @Description(en="Kind of resource attached to data.")
    private DocumentType documentKind;

    @JsonProperty
    @Label(en="Title")
    @Description(en="Title by which the cited resource is known which offers a quick information about its content.")
    private Map<String, String> title;

    @JsonProperty
    @Label(en="Date")
    @Description(en="Reference date for the cited document.")
    private Date date;

    @JsonProperty
    @Label(en="Contact")
    @Description(en="Name and position information for an individual or organization that is responsible for the resource.")
    private OjResponsibleParty documentContact;

    @JsonProperty
    @Label(en="Notes")
    @Description(en="Some additional details about the resource mainly concerning the domain to which the resource refers.")
    private Map<String, String> notes;

    @JsonProperty
    @Label(en="Resource hyperlink")
    @Description(en="Web site link allowing the user access to the information resource.")
    private String link;

    @JsonProperty
    @Label(en="ISBN code")
    @Description(en="If available, the International Standard Book Number can be reported in order to uniquely identify the resource cited.")
    private String isbn;

    @JsonProperty
    @Label(en="ISNN code")
    @Description(en="If available, the International Standard Serial Number (used to identify periodical publications such as reviews and scientific journals) can be reported in order to uniquely identify the resource cited.")
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
