package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class OjCodeList extends ResponseHandler {

    public OjCodeList() {}
    public OjCodeList(Object source) {
        super(source);
    }


    public MeIdentification getLinkedCodeList() {
        return null;
    }


    @JsonProperty
    public String getIDcodeList() {
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

}
