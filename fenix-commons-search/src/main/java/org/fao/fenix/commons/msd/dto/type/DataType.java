package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum DataType {
    code,
    customCode,
    enumeration,

    date,
    month,
    yaer,
    time,

    text,
    label,

    number,
    percentage,
    bool;

    private Map<String,String> labels = new HashMap<>();
    private DataType(String[] ... labels) { //EN,FR,ES,PT
        for (String[] l : labels)
            this.labels.put(l[0], l[1]);
    }

    public Map<String,String> getLabel()  {
        return labels;
    }

    public String getLabel(String language) {
        return labels.get(language);
    }
}
