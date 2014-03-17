package org.fao.fenix.commons.search.dto.resource;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.fao.fenix.commons.search.dto.resource.data.CodeListData;
import org.fao.fenix.commons.search.dto.resource.data.DataType;
import org.fao.fenix.commons.search.dto.resource.data.LayerData;
import org.fao.fenix.commons.search.dto.resource.data.TableData;
import org.fao.fenix.commons.search.dto.resource.index.Index;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "classType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CodeListData.class, name = "CodeListData"),
        @JsonSubTypes.Type(value = TableData.class, name = "TableData"),
        @JsonSubTypes.Type(value = LayerData.class, name = "LayerData")
})
public interface Resource {

    public String getClassType();

    public String getResourceType();
    public String getName();
    public String getSource();

    public Index getIndex();

    public Object getMetadata();

    public Object getData();
    public DataType getDataType();
    public Object getDSD();
    public Integer getCount();

}
