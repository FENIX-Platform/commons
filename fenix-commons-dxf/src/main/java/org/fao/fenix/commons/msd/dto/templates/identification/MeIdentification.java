package org.fao.fenix.commons.msd.dto.templates.identification;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.Map;

public class MeIdentification extends ResponseHandler {
    private Collection<MeIdentification> children;

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
    public DSD getDsd() {
        return null;
    }
    //Hierarchy
    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.identification.MeIdentification> getParents() {
        return null;
    }
    @JsonProperty
    public Collection<MeIdentification> getChildren() {
        return children;
    }
    @JsonProperty
    public void setChildren(Collection<MeIdentification> children) {
        this.children = children;
    }


}
