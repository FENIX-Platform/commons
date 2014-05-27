package org.fao.fenix.commons.msd.dto.type.dm;

import org.fao.fenix.commons.msd.dto.type.dsd.DSDDataType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface IndexedField {

    public DSDDataType value();


}
