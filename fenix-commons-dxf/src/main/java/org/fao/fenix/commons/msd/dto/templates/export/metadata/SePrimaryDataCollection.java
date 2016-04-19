package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Map;

public class SePrimaryDataCollection extends ResponseHandler {

    public SePrimaryDataCollection() {}
    public SePrimaryDataCollection(Object ... source) {
        super(source);
    }


    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjResponsibleParty getDataCollector() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getTypeOfCollection() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getSamplingProcedure() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataCollection() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getCollectionPeriodicity() {
        return null;
    }

}
