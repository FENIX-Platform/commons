package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum CellOfOrigin {
    lowerLeft (new String[]{"EN", "Lower left"}),
    upperLeft (new String[]{"EN", "Upper left"})

    ;private Map<String,String> label = new HashMap<>();
    private CellOfOrigin(String[]... labels) { //EN,FR,ES,PT
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
