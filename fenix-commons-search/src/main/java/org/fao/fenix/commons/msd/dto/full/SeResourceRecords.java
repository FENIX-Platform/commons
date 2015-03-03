package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.ConfidentialityStatus;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SeResourceRecords extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private String recordID;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList originOfCollectedValue;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Date creationDate;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> dataReliabilityQualifier;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double dataReliabilityIndicator;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private ConfidentialityStatus confidentialityStatus;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList observationStatus;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
