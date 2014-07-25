package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.full.*;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class OjCodeList extends ResponseHandler {

    public OjCodeList() {}
    public OjCodeList(Object source) {
        super(source);
    }



    @JsonProperty
    public String getCodeList() {
        Collection<org.fao.fenix.commons.msd.dto.full.Code> linkedCodes = getLinkedCodes();
        return linkedCodes!=null && linkedCodes.size()>0 ? linkedCodes.iterator().next().getCodeList().getUid() : null;
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
    public Map<String, String> getTitle() {
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

    public Collection<org.fao.fenix.commons.msd.dto.full.Code> getLinkedCodes() {
        return null;
    }

}
