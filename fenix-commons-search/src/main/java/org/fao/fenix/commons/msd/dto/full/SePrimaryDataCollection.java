package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SePrimaryDataCollection extends JSONEntity implements Serializable {

    @JsonProperty private OjResponsibleParty dataCollector;
    @JsonProperty private OjCodeList typeOfCollection;
    @JsonProperty private Map<String, String> samplingProcedure;
    @JsonProperty private Map<String, String> dataCollection;
    @JsonProperty private OjCodeList collectionPeriodicity;


    public OjResponsibleParty getDataCollector() {
        return dataCollector;
    }
    @Embedded
    public void setDataCollector(OjResponsibleParty dataCollector) {
        this.dataCollector = dataCollector;
    }

    public OjCodeList getTypeOfCollection() {
        return typeOfCollection;
    }
    @Embedded
    public void setTypeOfCollection(OjCodeList typeOfCollection) {
        this.typeOfCollection = typeOfCollection;
    }

    public Map<String, String> getSamplingProcedure() {
        return samplingProcedure;
    }

    public void setSamplingProcedure(Map<String, String> samplingProcedure) {
        this.samplingProcedure = samplingProcedure;
    }

    public Map<String, String> getDataCollection() {
        return dataCollection;
    }

    public void setDataCollection(Map<String, String> dataCollection) {
        this.dataCollection = dataCollection;
    }

    public OjCodeList getCollectionPeriodicity() {
        return collectionPeriodicity;
    }
    @Embedded
    public void setCollectionPeriodicity(OjCodeList collectionPeriodicity) {
        this.collectionPeriodicity = collectionPeriodicity;
    }
}
