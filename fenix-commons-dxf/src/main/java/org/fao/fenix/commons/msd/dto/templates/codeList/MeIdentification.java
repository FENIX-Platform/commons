package org.fao.fenix.commons.msd.dto.templates.codeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class MeIdentification extends ResponseHandler {

    public MeIdentification() {}
    public MeIdentification(Object ... source) {
        super(source);
    }


    @JsonProperty
    public String getUid() {
        return null;
    }
    @JsonProperty
    public String getVersion() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Date getCreationDate() {
        return null;
    }
    @JsonProperty
    public OjCodeList getCharacterSet() {
        return null;
    }
    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.identification.MeIdentification> getParents() {
        return null;
    }
    @JsonProperty
    public Collection<OjResponsibleParty> getContacts() {
        return null;
    }
    @JsonProperty
    public MeContent getMeContent() {
        return null;
    }

}
