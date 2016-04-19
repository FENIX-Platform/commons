package org.fao.fenix.commons.msd.dto.templates.export.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.type.CodeListType;

import java.util.Map;


public class SeCodeList extends ResponseHandler {

    public SeCodeList() {}
    public SeCodeList(Object ... source) {
        super(source);
    }


    @JsonProperty
    public Integer getNumberOfLevels() {
        return null;
    }
    @JsonProperty
    public CodeListType getTypeOfCodeList() {
        return null;
    }



}
