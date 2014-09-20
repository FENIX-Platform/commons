package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum ResponsiblePartyRole {
    resourceProvider,
    custodian,
    owner,
    user,
    distributor,
    originator,
    pointOfContact,
    principalInvestigator,
    processor,
    pubblisher,
    agency,
    coordinator,
    other;

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
