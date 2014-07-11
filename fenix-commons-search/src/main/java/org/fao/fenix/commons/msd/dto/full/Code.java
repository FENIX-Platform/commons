package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONdto;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.*;

public class Code extends JSONdto implements Serializable, Comparable<Code> {
    
    @JsonProperty private MeIdentification codeList;
    @JsonProperty private String code;
    @JsonProperty private Integer level;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Map<String, String> description;
    @JsonProperty @Embedded private Period validityPeriod;
    @JsonProperty private Collection<Code> parents;
    @JsonProperty private Collection<Code> children;
    @JsonProperty private Collection<Code> relations;

    public Code() { }
    public Code(MeIdentification codeList, String code) {
        this.codeList = codeList;
        this.code = code;
    }

    public MeIdentification getCodeList() {
        return codeList;
    }

    public void setCodeList(MeIdentification codeList) {
        this.codeList = codeList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public Period getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Period validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Collection<Code> getParents() {
        return parents;
    }

    public void setParents(Collection<Code> parents) {
        this.parents = parents;
    }

    public Collection<Code> getChildren() {
        return children;
    }

    public void setChildren(Collection<Code> children) {
        this.children = children;
    }

    public Collection<Code> getRelations() {
        return relations;
    }

    public void setRelations(Collection<Code> relations) {
        this.relations = relations;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    //Utils
    public void addTitle(String language, String label) {
        if (title == null)
            title = new HashMap<>();
        title.put(language, label);
    }
    public void addDescription(String language, String label) {
        if (description == null)
            description = new HashMap<>();
        description.put(language, label);
    }

    public void addParent(Code code) {
        if (parents == null)
            parents = new HashSet<>();
        parents.add(code);
    }
    public void addChild(Code code) {
        if (children == null)
            children = new HashSet<>();
        children.add(code);
        code.addParent(this);
    }
    public void addRelation(Code code) {
        if (relations == null)
            relations = new HashSet<>();
        relations.add(code);
    }

    public void setFromDate (Integer date) {
        if (validityPeriod==null)
            validityPeriod = new Period();
        validityPeriod.setFrom(date);
    }
    public void setToDate (Integer date) {
        if (validityPeriod==null)
            validityPeriod = new Period();
        validityPeriod.setTo(date);
    }

    public boolean isChild() {
        return parents!=null && parents.size()>0;
    }


    //Compare
    @Override
    public boolean equals(Object obj) {
        return obj!=null && obj instanceof Code && ((Code)obj).code.equals(code);
    }

    @Override
    public int compareTo(Code o) {
        return code.compareTo(o.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
