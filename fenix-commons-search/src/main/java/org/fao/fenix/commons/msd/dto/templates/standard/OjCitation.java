package org.fao.fenix.commons.msd.dto.templates.standard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.DocumentType;

import java.util.Date;
import java.util.Map;

public class OjCitation extends ResponseHandler {

    public OjCitation() {}
    public OjCitation(Object source) {
        super(source);
    }


    @JsonProperty
    public DocumentType getDocumentKind() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Date getDate() {
        return null;
    }
    @JsonProperty
    public OjResponsibleParty getDocumentContact() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getNotes() {
        return null;
    }
    @JsonProperty
    public String getLink() {
        return null;
    }
    @JsonProperty
    public String getISBN() {
        return null;
    }
    @JsonProperty
    public String getISSN() {
        return null;
    }

}
