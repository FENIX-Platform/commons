package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Format;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeDatum extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Datum")
    @Description(en= "Identifier of the datum used. Datum description is requested when the coordinate reference system citation is not supplied. A datum could be geodetic, vertical or engineering. A geodetic datum gives the relationship of a coordinate system to the Earth and is used as the basis for two or three dimensional system (in most cases it requires an ellipsoid definition). A vertical datum gives the relationship of gravity-related heights to a surface known as the geoid. A datum can be engineering if it is neither geodetic not vertical. For geodetic datum it could be useful to report the EPGS (European Petroleum Survey Group) coordinates.")
    @Order(1)
    @Format(Format.FORMAT.string)
    private OjCodeList datum;

    @JsonProperty
    @Label(en="Name of datum")
    @Description(en= "Name of the datum used.")
    @Order(2)
    @Format(Format.FORMAT.string)
    private Map<String, String> datumName;


    public Map<String, String> getDatumName() {
        return datumName;
    }

    public void setDatumName(Map<String, String> datumName) {
        this.datumName = datumName;
    }

    public OjCodeList getDatum() {
        return datum;
    }
    @Embedded
    public void setDatum(OjCodeList datum) {
        this.datum = datum;
    }
}
