package org.fao.fenix.commons.msd.dto.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE)
public class ResourceProxy {

    @JsonProperty private Object metadata;
    @JsonProperty private Collection data;
    @JsonProperty private Map<String,Map<String,String>> datasources;


    public ResourceProxy(Object metadata, Collection data) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        this(metadata, data, null, null);
    }
    public ResourceProxy(Object metadata, Collection data, Class<? extends ResponseHandler> dataProxyClass, Map<String,Map<String,String>> datasources) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.metadata = metadata;
        this.data = dataProxyClass!=null && data!=null ? ResponseBeanFactory.getInstances(data, dataProxyClass) : data;
        this.datasources = datasources;
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
}
