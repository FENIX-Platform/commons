package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.fao.fenix.commons.msd.dto.data.Resource;
import org.fao.fenix.commons.msd.dto.data.ResourceProxy;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;

public class CodeList extends ResourceProxy<MeIdentification,Code> {

    public static Collection<CodeList> getInstances (Collection<Resource<org.fao.fenix.commons.msd.dto.full.Code>> sources) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Collection<CodeList> buffer = new LinkedList<>();
        for (ResourceProxy<MeIdentification,Code> proxy : ResourceProxy.getInstances(sources,MeIdentification.class,Code.class))
            buffer.add(proxy!=null ? new CodeList(proxy) : null);
        return buffer;
    }
    public static CodeList getInstance (Resource<org.fao.fenix.commons.msd.dto.full.Code> source) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ResourceProxy<MeIdentification,Code> proxy = ResourceProxy.getInstance(source,MeIdentification.class,Code.class);
        return proxy!=null ? new CodeList(proxy) : null;
    }

    private CodeList(ResourceProxy<MeIdentification,Code> proxy) {
        super(proxy.getMetadata(), proxy.getData());
    }
}
