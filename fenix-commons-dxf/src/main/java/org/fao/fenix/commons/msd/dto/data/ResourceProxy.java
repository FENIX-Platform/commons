package org.fao.fenix.commons.msd.dto.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.utils.LimitedList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE)
public class ResourceProxy {

    @JsonProperty private Object metadata;
    @JsonProperty private Collection data;
    @JsonProperty private Long size;
    @JsonProperty private Map<String,Map<String,String>> datasources;


    public ResourceProxy(Object metadata, Collection data) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        this(metadata, data, null, null, data!=null ? (long)data.size() : null, null);
    }
    public ResourceProxy(Object metadata, Collection data, Class<? extends ResponseHandler> dataProxyClass, Map<String,Map<String,String>> datasources, Long size, Integer limit) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.metadata = metadata;
        this.data = dataProxyClass!=null && data!=null ? ResponseBeanFactory.getInstances(dataProxyClass, data) : data;
        this.datasources = datasources;
        this.size = size;
        if (this.data!=null && limit!=null && limit>0) {
            this.data = new LimitedList(data, limit);
            this.size = (long)this.data.size();
        }
    }


    public Object getMetadata() {
        return metadata;
    }

    public Collection getData() {
        return data;
    }

    public Map<String, Map<String, String>> getDatasources() {
        return datasources;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
