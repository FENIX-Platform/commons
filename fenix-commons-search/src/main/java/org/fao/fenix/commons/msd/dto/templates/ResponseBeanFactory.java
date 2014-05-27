package org.fao.fenix.commons.msd.dto.templates;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ResponseBeanFactory {

    private static Map<Class,Class> proxiedClasses = new HashMap<>();

    public static <T extends ResponseHandler> T getInstance(Object source, Class<T> destinationClass) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (source==null)
            return null;
        Class proxyClass = proxiedClasses.get(destinationClass);
        if (proxyClass==null) {
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.setSuperclass(destinationClass);
            proxyFactory.setUseCache(false);
            proxyFactory.setFilter(new MethodFilter() {
                @Override
                public boolean isHandled(Method method) {
                    return true;
                }
            });
            proxiedClasses.put(destinationClass, proxyClass = proxyFactory.createClass());
        }
        T instance = (T)proxyClass.newInstance();
        ((Proxy)instance).setHandler(destinationClass.getConstructor(Object.class).newInstance(source));
        return instance;
    }

    public static <T extends ResponseHandler> Collection<T> getInstances(Collection<?> sourceCollection, Class<T> destinationClass) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Collection<T> instances = null;
        if (sourceCollection!=null) {
            instances = new ArrayList<>(sourceCollection.size());
            for (Object source : sourceCollection)
                instances.add(getInstance(source, destinationClass));
        }
        return instances;
    }
}
