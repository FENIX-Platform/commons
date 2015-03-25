package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ConfidentialityStatus;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeResourceRecords extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Record identifier")
    @Description(en= "Row identifier. A code that identifies the measured value associated to each row of the dataset.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private String recordID;

    @JsonProperty
    @Label(en="Origin of collected value")
    @Description(en= "The origin of collected data at single-value level.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjCodeList originOfCollectedValue;

    @JsonProperty
    @Label(en="Creation date")
    @Description(en= "Creation date of the record.")
    private Date creationDate;

    @JsonProperty
    @Label(en="Data reliability qualifier")
    @Description(en= "Qualitative assessment of the consistence and stability of the observation.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> dataReliabilityQualifier;

    @JsonProperty
    @Label(en="Quantitative indicator of reliability")
    @Description(en= "Quantitative indicator of the consistence and stability of the observation.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Double dataReliabilityIndicator;

    @JsonProperty
    @Label(en="Restriction in access")
    @Description(en= "Level of confidentiality of single values (e.g. pubblic, shared, restricted ).")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private ConfidentialityStatus confidentialityStatus;

    @JsonProperty
    @Label(en="Observation status")
    @Description(en= "The status of the reported value (e.g. estmated value, missing value, time seies break . . . )")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private OjCodeList observationStatus;

    @JsonProperty
    @Label(en="Remarks")
    @Description(en= "Additional information related to a single data point.")
    @Order(-1)
    @Format(Format.FORMAT.string)
    private Map<String, String> remarks;


    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public OjCodeList getOriginOfCollectedValue() {
        return originOfCollectedValue;
    }
    @Embedded
    public void setOriginOfCollectedValue(OjCodeList originOfCollectedValue) {
        this.originOfCollectedValue = originOfCollectedValue;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getDataReliabilityQualifier() {
        return dataReliabilityQualifier;
    }

    public void setDataReliabilityQualifier(Map<String, String> dataReliabilityQualifier) {
        this.dataReliabilityQualifier = dataReliabilityQualifier;
    }

    public Double getDataReliabilityIndicator() {
        return dataReliabilityIndicator;
    }

    public void setDataReliabilityIndicator(Double dataReliabilityIndicator) {
        this.dataReliabilityIndicator = dataReliabilityIndicator;
    }

    public ConfidentialityStatus getConfidentialityStatus() {
        return confidentialityStatus;
    }

    public void setConfidentialityStatus(ConfidentialityStatus confidentialityStatus) {
        this.confidentialityStatus = confidentialityStatus;
    }

    public OjCodeList getObservationStatus() {
        return observationStatus;
    }
    @Embedded
    public void setObservationStatus(OjCodeList observationStatus) {
        this.observationStatus = observationStatus;
    }

    public Map<String, String> getRemarks() {
        return remarks;
    }

    public void setRemarks(Map<String, String> remarks) {
        this.remarks = remarks;
    }
}
