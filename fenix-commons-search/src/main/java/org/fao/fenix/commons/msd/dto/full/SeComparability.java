package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeComparability extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> comparabilityGeographical;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private Map<String, String> comparabilityTime;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
