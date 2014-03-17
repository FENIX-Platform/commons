package org.fao.fenix.commons.search.dto.resource.data;

import org.fao.fenix.commons.search.dto.resource.Resource;
import org.fao.fenix.commons.search.dto.resource.index.Index;

import java.util.HashMap;

public abstract class StandardData implements Resource {

    private String classType = this.getClass().getSimpleName();
    private String name;
    private String resourceType;
    private String sourceName;
    private Object metadata;
    private Integer size;
    private Index index;

    public StandardData() { }
    public StandardData(String name, String resourceType, String sourceName, Index index, Object metadata, Integer size) {
        this.name = name;
        this.resourceType = resourceType;
        this.sourceName = sourceName;
        this.index = index;
        this.size = size;
        this.metadata = metadata!=null ? metadata : new HashMap<String,Object>();
    }

    @Override
    public String getClassType() {
        return classType;
    }

    @Override
    public String getResourceType() {
        return resourceType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSource() {
        return sourceName;
    }

    @Override
    public Index getIndex() {
        return index;
    }

    @Override
    public Object getMetadata() {
        return metadata;
    }

    @Override
    public Integer getCount() {
        return size;
    }


    public void setClassType(String type) {
        this.classType = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setSource(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public void setCount(Integer size) {
        this.size = size;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
}
