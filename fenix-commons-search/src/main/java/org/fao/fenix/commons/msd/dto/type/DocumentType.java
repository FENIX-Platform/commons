package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum DocumentType {
    scientificPaper (new String[]{"EN", "Scientific paper"}),
    methodologicalNotes (new String[]{"EN", "Methodological notes"}),
    legalDocument (new String[]{"EN", "Legal document"}),
    handbook (new String[]{"EN", "Handbook"}),
    guidelines (new String[]{"EN", "Guidelines"}),
    adHocPress (new String[]{"EN", "Ad hoc press"}),
    news (new String[]{"EN", "News"}),
    website (new String[]{"EN", "Website"}),
    other (new String[]{"EN", "Other"});

    private Map<String,String> label = new HashMap<>();
    private DocumentType(String[] ... labels) { //EN,FR,ES,PT
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
