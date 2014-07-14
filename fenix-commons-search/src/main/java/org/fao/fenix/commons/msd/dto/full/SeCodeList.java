package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.CodeListType;

import java.io.Serializable;

public class SeCodeList extends JSONEntity implements Serializable {

    @JsonProperty private Integer numberOfLevels;
    @JsonProperty private CodeListType typeOfCodeList;


    public Integer getNumberOfLevels() {
        return numberOfLevels;
    }

    public void setNumberOfLevels(Integer numberOfLevels) {
        this.numberOfLevels = numberOfLevels;
    }

    public CodeListType getTypeOfCodeList() {
        return typeOfCodeList;
    }

    public void setTypeOfCodeList(CodeListType typeOfCodeList) {
        this.typeOfCodeList = typeOfCodeList;
    }
}
