package org.fao.fenix.commons.msd.dto.templates.standard.combined;

import org.fao.fenix.commons.msd.dto.templates.identification.DSD;
import org.fao.fenix.commons.msd.dto.templates.standard.metadata.MeIdentification;

public abstract class Metadata<T extends DSD> extends MeIdentification {

    public Metadata() {}
    public Metadata(Object source) {
        super(source);
    }


    public abstract T getDsd();

}
