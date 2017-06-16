package org.fao.fenix.commons.utils;

import javax.enterprise.context.ApplicationScoped;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@ApplicationScoped
public class BeanUtils extends org.apache.commons.beanutils.BeanUtils {

    public <T> T clone (Object source, Class<T> destinationType) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        if (source==null || destinationType==null)
            return null;
        T destination = destinationType.newInstance();
        copyProperties(destination, source);
        return destination;
    }


    public <T> T copyProperties (T destination, Object origin, String ... propertiesName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (origin!=null && destination!=null) {
            if (propertiesName==null || propertiesName.length==0)
                copyProperties(destination,origin);
            else
                for (String propertyName : propertiesName)
                    copyProperty(destination, origin, propertyName);
        }
        return destination;
    }

    public <T> T copyProperty (T destination, Object origin, String propertyName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (origin!=null && destination!=null && propertyName!=null) {
            Method get = origin.getClass().getMethod("get"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1));
            Method set = destination.getClass().getMethod("set"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1), get.getReturnType());
            set.invoke(destination, get.invoke(origin));
        }
        return destination;
    }

}
