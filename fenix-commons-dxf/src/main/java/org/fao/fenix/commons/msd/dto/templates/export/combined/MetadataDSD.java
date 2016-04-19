package org.fao.fenix.commons.msd.dto.templates.export.combined;

public abstract class MetadataDSD<T extends org.fao.fenix.commons.msd.dto.templates.export.dsd.DSD> extends org.fao.fenix.commons.msd.dto.templates.export.metadata.MeIdentification {

    public MetadataDSD() {}
    public MetadataDSD(Object ... source) {
        super(source);
    }



    public abstract T getDsd();

}
