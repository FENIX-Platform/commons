package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeRelevance extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> userNeeds;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> userSatisfaction;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> completeness;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Double completenessPercentage;


    public Map<String, String> getUserNeeds() {
        return userNeeds;
    }

    public void setUserNeeds(Map<String, String> userNeeds) {
        this.userNeeds = userNeeds;
    }

    public Map<String, String> getUserSatisfaction() {
        return userSatisfaction;
    }

    public void setUserSatisfaction(Map<String, String> userSatisfaction) {
        this.userSatisfaction = userSatisfaction;
    }

    public Map<String, String> getCompleteness() {
        return completeness;
    }

    public void setCompleteness(Map<String, String> completeness) {
        this.completeness = completeness;
    }

    public Double getCompletenessPercentage() {
        return completenessPercentage;
    }

    public void setCompletenessPercentage(Double completenessPercentage) {
        this.completenessPercentage = completenessPercentage;
    }
}
