package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Map;

public class SeDatum extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="")
    @Description(en= "")
    private OjCodeList datum;

    @JsonProperty
    @Label(en="")
    @Description(en= "")
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
