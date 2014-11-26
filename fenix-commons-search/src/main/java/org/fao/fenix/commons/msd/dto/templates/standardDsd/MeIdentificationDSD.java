package org.fao.fenix.commons.msd.dto.templates.standardDsd;

import org.fao.fenix.commons.msd.dto.templates.identification.DSD;

public abstract class MeIdentificationDSD <T extends DSD> extends org.fao.fenix.commons.msd.dto.templates.standard.MeIdentification {

    public MeIdentificationDSD() {}
    public MeIdentificationDSD(Object source) {
        super(source);
    }


    public abstract T getDsd();

}
