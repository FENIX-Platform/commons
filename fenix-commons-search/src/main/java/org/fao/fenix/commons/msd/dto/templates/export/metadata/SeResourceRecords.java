package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.ConfidentialityStatus;

import java.util.Date;
import java.util.Map;

public class SeResourceRecords extends ResponseHandler {

    public SeResourceRecords() {}
    public SeResourceRecords(Object source) {
        super(source);
    }


    @JsonProperty
    public String getRecordID() {
        return null;
    }
    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getOriginOfCollectedValue() {
        return null;
    }
    @JsonProperty
    public Date getCreationDate() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDataReliabilityQualifier() {
        return null;
    }
    @JsonProperty
    public Double getDataReliabilityIndicator() {
        return null;
    }
    @JsonProperty
    public ConfidentialityStatus getConfidentialityStatus() {
        return null;
    }


    @JsonProperty
    public org.fao.fenix.commons.msd.dto.templates.export.metadata.OjCodeList getObservationStatus() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getRemarks() {
        return null;
    }

}
