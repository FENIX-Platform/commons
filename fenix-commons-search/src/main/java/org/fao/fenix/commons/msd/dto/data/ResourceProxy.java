package org.fao.fenix.commons.msd.dto.data;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect({JsonMethod.NONE})
public class ResourceProxy {

    @JsonProperty private Object metadata;
    @JsonProperty private Collection data;


    public ResourceProxy(Object metadata, Collection data) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        this(metadata, data, null);
    }
    public ResourceProxy(Object metadata, Collection data, Class<? extends ResponseHandler> dataProxyClass) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.metadata = metadata;
        this.data = dataProxyClass!=null && data!=null ? ResponseBeanFactory.getInstances(data, dataProxyClass) : data;
    }


    public Object getMetadata() {
        return metadata;
    }

    public Collection getData() {
        return data;
    }

}
