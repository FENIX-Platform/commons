package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;



public class OjCodeList extends ResponseHandler {

    public OjCodeList() {}
    public OjCodeList(Object ... source) {
        super(source);
    }


    @JsonProperty
    public String getIdCodeList() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }
    @JsonProperty
    public Collection<OjCode> getCodes() {
        return null;
    }

    @JsonProperty
    public OjResponsibleParty getContactInfo() {
        return null;
    }
    @JsonProperty
    public String getLink() {
        return null;
    }
    @JsonProperty
    public Collection<OjCitation> getCodeListResources() {
        return null;
    }

    public MeIdentification getLinkedCodeList() {
        return null;
    }
}
