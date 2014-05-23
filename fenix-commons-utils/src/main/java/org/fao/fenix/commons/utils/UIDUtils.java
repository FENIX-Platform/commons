package org.fao.fenix.commons.utils;

import com.eaio.uuid.UUIDHelper;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UIDUtils {

    private ThreadLocal<String> currentUid = new ThreadLocal<>();

    public String newId(String ... prefix) {
        StringBuilder id = new StringBuilder();
        if (prefix!=null)
            for (String p:prefix)
                if (p!=null)
                    id.append(p).append('_');
        id.append(UUIDHelper.id());
        return id.toString();
    }

    public String getId() {
        String id = currentUid.get();
        if (id == null)
            currentUid.set(id = newId());
        return id;
    }
}
