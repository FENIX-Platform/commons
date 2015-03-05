package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.annotations.Description;
import org.fao.fenix.commons.annotations.Label;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.CodeListType;

import java.io.Serializable;

public class SeCodeList extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Number of levels")
    @Description(en= "Hierarchical codelists may have several levels, information about the number of levels must be reported in order to describe the hierchy of the codelist.")
    private Integer numberOfLevels;

    @JsonProperty
    @Label(en="Type of codelist")
    @Description(en= "Codelist typology. A codelist can be a simple objects basically composed by a list of couples of code and label or a more complex object whose elements present some hierarchical relationships.")
    private CodeListType typeOfCodeList;


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
