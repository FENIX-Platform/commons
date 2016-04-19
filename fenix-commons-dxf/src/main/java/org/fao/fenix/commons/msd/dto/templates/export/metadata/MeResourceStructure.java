package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;

public class MeResourceStructure extends ResponseHandler {

    public MeResourceStructure() {}
    public MeResourceStructure(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Collection<org.fao.fenix.commons.msd.dto.templates.export.metadata.SeResourceDimensions> getSeResourceDimensions() {
        return null;
    }
    @JsonProperty
    public Collection<SeResourceRecords> getSeResourceRecords() {
        return null;
    }

}
