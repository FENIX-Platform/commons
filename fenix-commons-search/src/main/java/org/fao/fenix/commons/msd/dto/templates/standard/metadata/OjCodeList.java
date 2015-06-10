package org.fao.fenix.commons.msd.dto.templates.standard.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class OjCodeList extends ResponseHandler {

    public OjCodeList() {}
    public OjCodeList(Object source) {
        super(source);
    }


    @JsonProperty
    public String getIdCodeList() {
        MeIdentification linked = getLinkedCodeList();
        return linked!=null ? linked.getUid() : null;
    }
    @JsonProperty
    public String getVersion() {
        MeIdentification linked = getLinkedCodeList();
        return linked!=null ? linked.getVersion() : null;
    }
    @JsonProperty
    public Collection<OjCode> getCodes() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getExtendedName() {
        MeIdentification linked = getLinkedCodeList();
        return linked!=null ? linked.getTitle() : null;
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
