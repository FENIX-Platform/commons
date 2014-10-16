package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum ReferenceEntity {
    meIdentification (new String[]{"EN", "Identification"}),
    meContent (new String[]{"EN", "Content"}),
    meInstitutionalMandate (new String[]{"EN", "Institutional mandate"}),
    meComparability (new String[]{"EN", "Comparability"}),
    meStatisticalProcessing (new String[]{"EN", "Statistical processing"}),
    meDataQuality (new String[]{"EN", "Data quality"}),
    meAccessibility (new String[]{"EN", "Accessibility"}),
    meMaintenance (new String[]{"EN", "Maintenance"}),
    meDocuments (new String[]{"EN", "Documents"}),
    meResourceDimensions (new String[]{"EN", "Resource dimensions"}),
    meSpatialRepresentation (new String[]{"EN", "Spatial representation"}),
    meReferenceSystem (new String[]{"EN", "Reference system"});

    private Map<String,String> label = new HashMap<>();
    private ReferenceEntity(String[]... labels) { //EN,FR,ES,PT
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
