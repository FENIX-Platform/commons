package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum ResponsiblePartyRole {
    resourceProvider (new String[]{"EN", "Resource provider"}),
    custodian (new String[]{"EN", "Custodian"}),
    owner (new String[]{"EN", "Owner"}),
    user (new String[]{"EN", "User"}),
    distributor (new String[]{"EN", "Distributor"}),
    originator (new String[]{"EN", "Originator"}),
    pointOfContact (new String[]{"EN", "Point of contact"}),
    principalInvestigator (new String[]{"EN", "Principal investigator"}),
    processor (new String[]{"EN", "Processor"}),
    pubblisher (new String[]{"EN", "Pubblisher"}),
    agency (new String[]{"EN", "Agency"}),
    coordinator (new String[]{"EN", "Coordinator"}),
    other (new String[]{"EN", "Other"});

    private Map<String,String> label = new HashMap<>();
    private ResponsiblePartyRole(String[] ... labels) { //EN,FR,ES,PT
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
