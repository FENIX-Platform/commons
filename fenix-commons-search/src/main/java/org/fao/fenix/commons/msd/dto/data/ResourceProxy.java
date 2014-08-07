package org.fao.fenix.commons.msd.dto.data;

import javassist.util.proxy.Proxy;
import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;
import org.fao.fenix.commons.msd.dto.templates.ResponseHandler;
import org.fao.fenix.commons.msd.dto.templates.codeList.Period;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class ResourceProxy <M extends ResponseHandler, D> {


    public static <M extends ResponseHandler, D, S> Collection<ResourceProxy<M,D>> getInstances(Collection<Resource<S>> sources, Class<M> metadataProxyClass, Class<D> dataProxyClass) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Collection<ResourceProxy<M,D>> proxies = new LinkedList<>();
        if (sources!=null)
            for (Resource source : sources)
                proxies.add(getInstance(source,metadataProxyClass,dataProxyClass));
        return proxies;
    }
    public static <M extends ResponseHandler, D, S> ResourceProxy getInstance(Resource<S> source, Class<M> metadataProxyClass, Class<D> dataProxyClass) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if (source!=null)
            if (ResponseHandler.class.isAssignableFrom(dataProxyClass))
                return new ResourceProxy(
                    ResponseBeanFactory.getInstance(source.getMetadata(), metadataProxyClass),
                    ResponseBeanFactory.getInstances(source.getData(), (Class<? extends ResponseHandler>)dataProxyClass)
                );
            else
                return new ResourceProxy( ResponseBeanFactory.getInstance(source.getMetadata(), metadataProxyClass), source.getData() );
        else
            return null;
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

}
