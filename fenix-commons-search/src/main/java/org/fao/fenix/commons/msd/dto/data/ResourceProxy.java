package org.fao.fenix.commons.msd.dto.data;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.codeList.Period;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class ResourceProxy <M extends ResponseHandler, D extends ResponseHandler> {


    public static <M extends ResponseHandler, D extends ResponseHandler, S> Collection<ResourceProxy<M,D>> getInstances(Collection<Resource<S>> sources, Class<M> metadataProxyClass, Class<D> dataProxyClass) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Collection<ResourceProxy<M,D>> proxies = new LinkedList<>();
        if (sources!=null)
            for (Resource source : sources)
                proxies.add(getInstance(source,metadataProxyClass,dataProxyClass));
        return proxies;
    }
    public static <M extends ResponseHandler, D extends ResponseHandler, S> ResourceProxy getInstance(Resource<S> source, Class<M> metadataProxyClass, Class<D> dataProxyClass) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return source==null ? null : new ResourceProxy(
            ResponseBeanFactory.getInstance(source.getMetadata(), metadataProxyClass),
            ResponseBeanFactory.getInstances(source.getData(), dataProxyClass)
        );
    }

    private M metadata;
    private Collection<D> data;


    protected ResourceProxy(M metadata, Collection<D> data) {
        this.metadata = metadata;
        this.data = data;
    }

    @JsonProperty
    public M getMetadata() {
        return metadata;
    }

    @JsonProperty
    public Collection<D> getData() {
        return data;
    }

    //Utils
    @JsonProperty
    public Integer getSize() {
        return data!=null ? data.size() : 0;
    }

}
