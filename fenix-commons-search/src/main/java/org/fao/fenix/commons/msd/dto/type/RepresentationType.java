package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum RepresentationType {
    dataset (new String[]{"EN", "Dataset"}),
    document (new String[]{"EN", "Document"}),
    geographic (new String[]{"EN", "Geographic"}),
    codelist (new String[]{"EN", "Codelist"}),
    other (new String[]{"EN", "Other"});

    private Map<String,String> label = new HashMap<>();
    private RepresentationType(String[] ... labels) { //EN,FR,ES,PT
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
