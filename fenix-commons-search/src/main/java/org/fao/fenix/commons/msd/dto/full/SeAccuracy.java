package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeAccuracy extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Accuracy - non sampling error")
    @Description(en= "Error in sample estimates which cannot be attributed to sampling fluctuations. (e.g. defects in the sampling frame, faulty demarcation of sample units, defects in the selection of sample units, mistakes in the collection of data due to personal variations, misunderstanding, bias, negligence . . . etc.)")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> accuracyNonSampling;

    @JsonProperty
    @Label(en="Accuracy - sampling error")
    @Description(en= "If probability sampling is used, the accuracy is an evaluation of difference between a population value and an estimate thereof, derived from a random sample (so due to the fact that only a subset of the population is enumerate), normally in the form of coefficient of variation, standard error or confidence intervals. For non-probability sampling, random errors cannot be calculated without reference to some kind of model, in this case estimates of the accuracy, a motivation for the invoked model for this estimation and brief discussion of sampling bias should be provided.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> accuracySampling;


    public Map<String, String> getAccuracyNonSampling() {
        return accuracyNonSampling;
    }

    public void setAccuracyNonSampling(Map<String, String> accuracyNonSampling) {
        this.accuracyNonSampling = accuracyNonSampling;
    }

    public Map<String, String> getAccuracySampling() {
        return accuracySampling;
    }

    public void setAccuracySampling(Map<String, String> accuracySampling) {
        this.accuracySampling = accuracySampling;
    }
}
