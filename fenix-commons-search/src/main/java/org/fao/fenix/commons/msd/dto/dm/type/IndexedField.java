package org.fao.fenix.commons.msd.dto.dm.type;

import org.fao.fenix.commons.msd.dto.dsd.type.DSDDataType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface IndexedField {

    public DSDDataType value();


}
