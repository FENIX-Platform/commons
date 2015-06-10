package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DocumentType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OjCitation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Kind of document",fr="Type de document",es="Tipo de documento")
    @Description(en="Kind of resource attached to data.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private DocumentType documentKind;

    @JsonProperty
    @Label(en="Title",fr="Titre",es="Título")
    @Description(en="Title by which the cited resource is known which offers a quick information about its content.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> title;

    @JsonProperty
    @Label(en="Date",fr="Date",es="Fecha")
    @Description(en="Reference date for the cited document.")
    @Order(3)
    @Format(Format.FORMAT.date)
    private Date date;

    @JsonProperty
    @Label(en="Contact",fr="Contact",es="Contacto")
    @Description(en="Name and position information for an individual or organization that is responsible for the resource.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private OjResponsibleParty documentContact;

    @JsonProperty
    @Label(en="Notes",fr="Remarques",es="Notas")
    @Description(en="Some additional details about the resource mainly concerning the domain to which the resource refers.")
    @Order(5)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> notes;

    @JsonProperty
    @Label(en="Resource hyperlink",fr="Lien hypertexte de documents",es="Hipervínculo Documento")
    @Description(en="Web site link allowing the user access to the information resource.")
    @Order(6)
    @Format(Format.FORMAT.url)
    private String link;

    @JsonProperty
    @Label(en="ISBN code",fr="Code ISBN",es="Código ISBN")
    @Description(en="If available, the International Standard Book Number can be reported in order to uniquely identify the resource cited.")
    @Order(7)
    @Format(Format.FORMAT.string)
    private String isbn;

    @JsonProperty
    @Label(en="ISNN code",fr="Code ISSN",es="Código ISSN")
    @Description(en="If available, the International Standard Serial Number (used to identify periodical publications such as reviews and scientific journals) can be reported in order to uniquely identify the resource cited.")
    @Order(8)
    @Format(Format.FORMAT.string)
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
