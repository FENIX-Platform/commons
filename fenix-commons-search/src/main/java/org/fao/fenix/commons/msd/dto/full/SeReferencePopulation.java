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

public class SeReferencePopulation extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Statistical population",fr="Population statistique",es="Población estadística")
    @Description(en= "Target statistical population (one or more) the resource refers to.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private Map<String, String> statisticalPopulation;

    @JsonProperty
    @Label(en="Statistical unit",fr="Unité statistique",es="Unidad estadística")
    @Description(en= "Simplest unit for which information is sought and for which statistics are ultimately compiled.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> statisticalUnit;

    @JsonProperty
    @Label(en="Period of reference",fr="Période de référence",es="Período de referencia")
    @Description(en= "Specific time periods (e.g. a day, a week, a month, a fiscal year, a calendar year or several calendar years) the statistical variables refer to.")
    @Order(3)
    @Format(Format.FORMAT.string)
    private OjCodeList referencePeriod;

    @JsonProperty
    @Label(en="Area of reference",fr="Area de référence",es="Área de referencia")
    @Description(en= "Type of geographical units the resource represents or refers to. Note that the spatial resolution must refer to the minimum mapping unit whose bounds are officially recognized indipendently from the measurement process of the phonomenon taken into account. Examples are: countries, administrative level 2, etc.")
    @Order(4)
    @Format(Format.FORMAT.string)
    private OjCodeList referenceArea;


    public Map<String, String> getStatisticalPopulation() {
        return statisticalPopulation;
    }

    public void setStatisticalPopulation(Map<String, String> statisticalPopulation) {
        this.statisticalPopulation = statisticalPopulation;
    }

    public Map<String, String> getStatisticalUnit() {
        return statisticalUnit;
    }

    public void setStatisticalUnit(Map<String, String> statisticalUnit) {
        this.statisticalUnit = statisticalUnit;
    }

    public OjCodeList getReferencePeriod() {
        return referencePeriod;
    }
    @Embedded
    public void setReferencePeriod(OjCodeList referencePeriod) {
        this.referencePeriod = referencePeriod;
    }

    public OjCodeList getReferenceArea() {
        return referenceArea;
    }
    @Embedded
    public void setReferenceArea(OjCodeList referenceArea) {
        this.referenceArea = referenceArea;
    }
}
