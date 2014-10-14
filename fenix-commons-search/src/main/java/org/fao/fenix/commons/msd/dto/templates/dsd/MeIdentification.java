package org.fao.fenix.commons.msd.dto.templates.dsd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.standard.*;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class MeIdentification extends org.fao.fenix.commons.msd.dto.templates.standard.MeIdentification {

    public MeIdentification() {}
    public MeIdentification(Object source) {
        super(source);
    }



    @JsonProperty
    public DSDDataset getDsd() {
        return null;
    }
}
