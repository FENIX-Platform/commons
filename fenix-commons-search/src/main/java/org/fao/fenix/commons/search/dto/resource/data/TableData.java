package org.fao.fenix.commons.search.dto.resource.data;

import org.fao.fenix.commons.msd.dto.full.cl.Code;
import org.fao.fenix.commons.msd.dto.full.dsd.DSD;
import org.fao.fenix.commons.msd.dto.full.dsd.DSDColumn;
import org.fao.fenix.commons.search.dto.resource.index.Index;

import java.util.Collection;

public class TableData extends StandardData {

    private DSD DSD;
    private Iterable<Object[]> data;

    public TableData() { }
    public TableData(String name, String resourceType, String sourceName, Index index, Object metadata, DSD DSD, Iterable<Object[]> data, Integer size) {
        super(name,resourceType,sourceName,index,metadata, size);

        if ((this.data = data)!=null)
            this.DSD = DSD!=null ? DSD : new DSD();
    }

    @Override
    public DataType getDataType() {
        return DataType.table;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public Object getDSD() {
        return DSD;
    }




    public void setDSD(DSD DSD) { this.DSD = DSD; }

    public void setData(Iterable<Object[]> data) {
        this.data = data;
    }

    public void setDataType(DataType dataType) { }


    //Utils
    public void addColumn(DSDColumn columnMetadata) {
        DSD.addColumn(columnMetadata);
    }

}
