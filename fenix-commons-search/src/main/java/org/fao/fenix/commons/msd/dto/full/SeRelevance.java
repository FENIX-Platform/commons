package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeRelevance extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="User needs",fr="Besoins des utilisateurs",es="Necesidades de los usuarios")
    @Description(en= "Classification of users with some indication of their importance, an indication of the uses for which they want the statistical outputs and as well users and uses given special considerations. Unmet user needs and the reasons for not meeting them should be included as well.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> userNeeds;

    @JsonProperty
    @Label(en="User satisfaction",fr="Satisfaction des utilisateurs",es="La satisfacción del usuario")
    @Description(en= "How the views and opinions of the users are collected. In addition the main results regarding the user satisfaction should be shown (in the form of a user satisfaction index if available) and the date of most recent user satisfaction survey.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> userSatisfaction;

    @JsonProperty
    @Label(en="Completeness",fr="Exhaustivité",es="Exhaustividad")
    @Description(en= "State of completeness of the resource.")
    @Order(3)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> completeness;

    @JsonProperty
    @Label(en="Percentage of completeness",fr="Pourcentage d'exhaustivité",es="Porcentaje de integridad")
    @Description(en= "Percentage of the state of completeness of the resource.")
    @Order(4)
    @Format(Format.FORMAT.string)
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
