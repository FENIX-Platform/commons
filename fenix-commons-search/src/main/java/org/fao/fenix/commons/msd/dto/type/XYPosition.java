package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum XYPosition {
    centre (new String[]{"EN", "Centre"}),
    corner (new String[]{"EN", "Corner"})

    ;private Map<String,String> label = new HashMap<>();
    private XYPosition(String[]... labels) { //EN,FR,ES,PT
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
