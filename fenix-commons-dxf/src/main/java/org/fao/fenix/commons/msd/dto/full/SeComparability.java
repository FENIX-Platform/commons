package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeComparability extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Geographic comparability",fr="Comparabilité géographique",es="Comparabilidad temporal")
    @Description(en= "Degree of data comparability across the geographic areas or regions referenced by the resource. Data might be derived from surveys that in general are conducted by different statistical agencies. These surveys often refer to populations of different geographical areas, sometimes based on different methodologies.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> comparabilityGeographical;

    @JsonProperty
    @Label(en="Time comparability",fr="Comparabilité du temps",es="Comparabilidad Tiempo")
    @Description(en= "Extent to which data are comparable or reconcilable over time. It refers to the degree of comparability between the measures of a time series (e.g. related to a country, a commodity and a variable) included in the resource.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> comparabilityTime;

    @JsonProperty
    @Label(en="Internal coherence",fr="Cohérence interne",es="Coherencia interna")
    @Description(en= "General estimate of the extent to which data are consistent within the resource.")
    @Order(3)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> coherenceIntern;


    public Map<String, String> getComparabilityGeographical() {
        return comparabilityGeographical;
    }

    public void setComparabilityGeographical(Map<String, String> comparabilityGeographical) {
        this.comparabilityGeographical = comparabilityGeographical;
    }

    public Map<String, String> getComparabilityTime() {
        return comparabilityTime;
    }

    public void setComparabilityTime(Map<String, String> comparabilityTime) {
        this.comparabilityTime = comparabilityTime;
    }

    public Map<String, String> getCoherenceIntern() {
        return coherenceIntern;
    }

    public void setCoherenceIntern(Map<String, String> coherenceIntern) {
        this.coherenceIntern = coherenceIntern;
    }
}
