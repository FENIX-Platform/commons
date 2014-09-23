package org.fao.fenix.commons.msd.dto.templates.standardDsd;

import org.codehaus.jackson.annotate.JsonProperty;


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
