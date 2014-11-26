package org.fao.fenix.commons.msd.dto.templates.standardDsd;

import org.fao.fenix.commons.msd.dto.templates.dsd.DSD;

public abstract class MeIdentificationDSDFull <T extends DSD> extends org.fao.fenix.commons.msd.dto.templates.standard.MeIdentification {

    public MeIdentificationDSDFull() {}
    public MeIdentificationDSDFull(Object source) {
        super(source);
    }



    public abstract T getDsd();

}
