package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum DimensionType {
    freeText (new String[]{"EN", "Free text"}),
    coded (new String[]{"EN", "Coded"}),
    number (new String[]{"EN", "Number"});

    private Map<String,String> label = new HashMap<>();
    private DimensionType(String[]... labels) { //EN,FR,ES,PT
        for (String[] l : labels)
            label.put(l[0],l[1]);
    }

    public Map<String,String> getLabel()  {
        return label;
    }

    public String getLabel(String language) {
        return label.get(language);
    }


}
