package org.fao.fenix.commons.utils;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class UIDUtils {

    private ThreadLocal<String> currentUid = new ThreadLocal<>();

    public String newId(String ... body) {
        StringBuilder id = new StringBuilder();
        if (body!=null)
            for (String p:body)
                if (p!=null)
                    id.append(p).append('_');
        return (id.length()>0 ? UUID.nameUUIDFromBytes(id.toString().getBytes()) : UUID.randomUUID()).toString();
    }

    public String getId() {
        String id = currentUid.get();
        if (id == null)
            currentUid.set(id = newId());
        return id;
    }
}
