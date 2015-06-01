package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.*;

public class Code extends JSONEntity implements Serializable, Comparable<Code> {
    
    @JsonProperty
    private MeIdentification codeList;

    @JsonProperty
    private String code;

    @JsonProperty
    private Integer level;

    @JsonProperty
    private Map<String, String> title;

    @JsonProperty
    private Map<String, String> description;

    @JsonProperty
    private Period validityPeriod;

    @JsonProperty
    private Collection<Code> parents;

    @JsonProperty
    private Collection<Code> children;

    @JsonProperty
    private Collection<Code> relations;

    private String indexLabel;

    public Code() { }
    public Code(String code, Map<String, String> title) {
        this.code = code;
        this.title = title;
    }
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
    @Embedded
    public void setValidityPeriod(Period validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Collection<Code> getParents() {
        return parents;
    }

    public void setParents(Collection<Code> parents) {
        this.parents = parents!=null ? new LinkedHashSet<>(parents) : null;
    }

    public Collection<Code> getChildren() {
        return children;
    }

    public void setChildren(Collection<Code> children) {
        this.children = children!=null ? new LinkedHashSet<>(children) : null;
    }

    public Collection<Code> getRelations() {
        return relations;
    }

    public void setRelations(Collection<Code> relations) {
        this.relations = relations!=null ? new LinkedHashSet<>(relations) : null;
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
            parents = new LinkedHashSet<>();
        parents.add(code);
    }
    public void addChild(Code code) {
        if (children == null)
            children = new LinkedHashSet<>();
        children.add(code);
    }
    public void addChildren(Collection<Code> codes) {
        if (children == null)
            children = new LinkedHashSet<>();
        if (codes!=null)
            children.addAll(codes);
    }
    public void addRelation(Code code) {
        if (relations == null)
            relations = new LinkedHashSet<>();
        relations.add(code);
    }

    public void setFromDate (Long date) {
        if (validityPeriod==null)
            validityPeriod = new Period();
        validityPeriod.setFrom(date);
    }
    public void setToDate (Long date) {
        if (validityPeriod==null)
            validityPeriod = new Period();
        validityPeriod.setTo(date);
    }

    public boolean isChild() {
        return parents!=null && parents.size()>0;
    }

    public String getIndexLabel() {
        return indexLabel;
    }

    public void setIndexLabel(String indexLabel) {
        this.indexLabel = indexLabel;
    }

    //Compare
    @Override
    public boolean equals(Object obj) {
        return obj!=null && obj instanceof Code && ((Code)obj).getCode().equals(getCode());
    }

    @Override
    public int compareTo(Code o) {
        return getCode().compareTo(o.getCode());
    }

    @Override
    public int hashCode() {
        return getCode().hashCode();
    }
}
