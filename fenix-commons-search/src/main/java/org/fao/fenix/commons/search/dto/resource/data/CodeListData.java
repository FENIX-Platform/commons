package org.fao.fenix.commons.search.dto.resource.data;

import org.fao.fenix.commons.msd.dto.templates.canc.cl.Code;
import org.fao.fenix.commons.msd.dto.templates.canc.dsd.DSD;
import org.fao.fenix.commons.search.dto.resource.index.Index;

import java.util.Collection;

public class CodeListData extends StandardData {

    private Collection<Code> data;

    public CodeListData() { }
    public CodeListData(String name, String resourceType, String sourceName, Index index, Object metadata, Collection<Code> data, Integer size) {
        super(name,resourceType,sourceName,index,metadata,size);
        this.data = data;
    }

    @Override
    public DataType getDataType() {
        return DataType.tree;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public Object getDSD() { return null; }


    public void setDSD(Object DSD) { }

    public void setData(Collection<Code> data) {
        this.data = data;
    }

    public void setDataType(DataType dataType) { }
}
