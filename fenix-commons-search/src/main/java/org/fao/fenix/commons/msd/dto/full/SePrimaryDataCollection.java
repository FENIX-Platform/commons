package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SePrimaryDataCollection extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjResponsibleParty dataCollector;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList typeOfCollection;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> samplingProcedure;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> dataCollection;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList collectionPeriodicity;


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
