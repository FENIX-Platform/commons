package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SePrimaryDataCollection extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Data collector",fr="Collecteur de données",es="Colector de datos")
    @Description(en= "The entity (individual, agency or institution) responsible for administering the questionnaire or interview or compiling the data.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private OjResponsibleParty dataCollector;

    @JsonProperty
    @Label(en="Type of collection",fr="Type de collection",es="Tipo de colección")
    @Description(en= "Coded element which specifies the type of data collection method (e.g. census, random sampling, etc.).")
    @Order(2)
    @Format(Format.FORMAT.string)
    private OjCodeList typeOfCollection;

    @JsonProperty
    @Label(en="Sampling procedure",fr="Procédure d'échantillonnage",es="Procedimiento de muestreo")
    @Description(en= "The type of sample design used to select the survey respondents to represent the population. It may refer to information on sample design, sample size, sample frame, sample updating etc.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private Map<String, String> samplingProcedure;

    @JsonProperty
    @Label(en="Data collection",fr="Collecte des données",es="Recolección de datos")
    @Description(en= "Methods used to gather data from the respondents (e.g. postal survey, CAPI, on-line survey, face-to-face interviews etc.) and description of data collection methods. This metadata element also includes more precise information about the kind of questionnaire (structured, unstructured etc.) and if necessary somenoteworthy aspects of the data collection process.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private Map<String, String> dataCollection;

    @JsonProperty
    @Label(en="Periodicity of data collection",fr="Périodicité de la collecte de données",es="Periodicidad de la recogida de datos")
    @Description(en= "Frequency with which the data are collected from the sources.")
    @Order(5)
    @Format(Format.FORMAT.string)
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
