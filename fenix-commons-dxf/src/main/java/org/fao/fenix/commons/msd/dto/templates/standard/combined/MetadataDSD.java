package org.fao.fenix.commons.msd.dto.templates.standard.combined;

import org.fao.fenix.commons.msd.dto.templates.standard.dsd.DSD;
import org.fao.fenix.commons.msd.dto.templates.standard.metadata.MeIdentification;

public abstract class MetadataDSD<T extends DSD> extends MeIdentification {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }



    public abstract T getDsd();

}
