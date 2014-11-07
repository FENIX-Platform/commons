package org.fao.fenix.commons.msd.dto.templates.codeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class Code extends ResponseHandler {

    public Code() {}
    public Code(Object source) {
        super(source);
    }
    

    @JsonProperty
    public String getCode() {
        return null;
    }
    @JsonProperty
    public Integer getLevel() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getTitle() {
        return null;
    }
    @JsonProperty
    public Map<String, String> getDescription() {
        return null;
    }
    @JsonProperty
    public Period getValidityPeriod() {
        return null;
    }
    @JsonProperty
    public Collection<Code> getChildren() {
        Integer currentLevel = getLevel();
        Integer[] levelParameters = levelInfo.get();
        return currentLevel!=null && levelParameters!=null && ((levelParameters[0]!=null && currentLevel<levelParameters[0]) || (levelParameters[1]!=null && currentLevel>=levelParameters[1])) ? new LinkedList<Code>() : null;
    }
    @JsonProperty
    public boolean isLeaf() {
        Collection<Code> children = getChildren();
        return children==null || children.size()==0;
    }


    //Levels filter support
    public static ThreadLocal<Integer[]> levelInfo = new ThreadLocal<>();
}
