package org.fao.fenix.commons.search.dto.resource.data;

import org.fao.fenix.commons.msd.dto.full.dsd.DSD;
import org.fao.fenix.commons.search.dto.resource.index.Index;

public class LayerData extends StandardData {

    private DSD DSD;
    private Object data;
    DataType dataType;

    public LayerData() { }
    public LayerData(String name, String resourceType, String sourceName, Index index, DataType dataType, Object metadata, DSD DSD, Object data, Integer size) {
        super(name,resourceType,sourceName,index,metadata, size);
        this.dataType = dataType!=null ? dataType : DataType.raster;
        if ((this.data = data)!=null)
            this.DSD = DSD!=null ? DSD : new DSD();
    }

    @Override
    public DataType getDataType() {
        return dataType;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public Object getDSD() {
        return DSD;
    }




    public void setDSD(DSD DSD) {
        this.DSD = DSD;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
}
