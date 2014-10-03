package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
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
        if (currentLevel!=null && levelParameters!=null) {
            Integer level = levelParameters[0];
            Integer levels = levelParameters[1];
            Integer levelIndex = levelParameters[2];
            if (level!=null && currentLevel<level)
                return new LinkedList<>();
            if (levels!=null)
                if (levelIndex>=levels)
                    return new LinkedList<>();
                else
                    levelParameters[2] = levelIndex+1;
        }
        return null;
    }

    //Levels filter support
    public static ThreadLocal<Integer[]> levelInfo = new ThreadLocal<>();
}
