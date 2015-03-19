package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeDataValidation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Data validation - intermediate")
    @Description(en= "Assessment of the quality and correctness of intermediate calculations leading to statistical outputs.")
    private Map<String, String> dataValidationIntermediate;

    @JsonProperty
    @Label(en="Data validation - output")
    @Description(en= "Assessment of discrepancies and/or inaccuracies observed in the statistical outputs.")
    private Map<String, String> dataValidationOutput;

    @JsonProperty
    @Label(en="Data validation - source")
    @Description(en= "Assessment of discrepancies and/or inaccuracies inherent to the data source.")
    private Map<String, String> dataValidationSource;


    public Map<String, String> getDataValidationIntermediate() {
        return dataValidationIntermediate;
    }

    public void setDataValidationIntermediate(Map<String, String> dataValidationIntermediate) {
        this.dataValidationIntermediate = dataValidationIntermediate;
    }

    public Map<String, String> getDataValidationOutput() {
        return dataValidationOutput;
    }

    public void setDataValidationOutput(Map<String, String> dataValidationOutput) {
        this.dataValidationOutput = dataValidationOutput;
    }

    public Map<String, String> getDataValidationSource() {
        return dataValidationSource;
    }

    public void setDataValidationSource(Map<String, String> dataValidationSource) {
        this.dataValidationSource = dataValidationSource;
    }
}
