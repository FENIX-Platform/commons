package org.fao.fenix.commons.msd.dto.templates.export.combined;

import org.fao.fenix.commons.msd.dto.templates.identification.DSD;

public abstract class Metadata<T extends DSD> extends org.fao.fenix.commons.msd.dto.templates.export.metadata.MeIdentification {

    public Metadata() {}
    public Metadata(Object source) {
        super(source);
    }


    public abstract T getDsd();

}
