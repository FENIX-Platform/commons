package org.fao.fenix.commons.msd.dto.templates.standardDsd;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.identification.DSDDataset;

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class MeIdentification extends org.fao.fenix.commons.msd.dto.templates.standard.MeIdentification {

    public MeIdentification() {}
    public MeIdentification(Object source) {
        super(source);
    }


    //@JsonProperty
    public DSDDataset getDsd() {
        return null;
    }

/*
    public String getUid() {
        return "test";
    }
    */
}
