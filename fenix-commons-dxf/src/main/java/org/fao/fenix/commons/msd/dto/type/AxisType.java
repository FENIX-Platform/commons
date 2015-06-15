package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum AxisType {
    row (new String[]{"EN", "Row"}),
    column (new String[]{"EN", "Column"}),
    vertical (new String[]{"EN", "Vertical"}),
    time (new String[]{"EN", "Time"});

    private Map<String,String> label = new HashMap<>();
    private AxisType(String[] ... labels) { //EN,FR,ES,PT
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
