package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum DataType {
    code (new String[]{"EN", "Code"}),
    customCode (new String[]{"EN", "Custom code"}),
    enumeration (new String[]{"EN", "Enumerated value"}),

    date (new String[]{"EN", "Day"}),
    month (new String[]{"EN", "Month"}),
    yaer (new String[]{"EN", "Yaer"}),
    time (new String[]{"EN", "Time stamp"}),

    text (new String[]{"EN", "Label"}),
    label (new String[]{"EN", "Multilanguage label"}),

    number (new String[]{"EN", "Number"}),
    percentage (new String[]{"EN", "Percentage"}),
    bool (new String[]{"EN", "Boolean"});

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
