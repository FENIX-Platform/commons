package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum ReferenceEntity {
    ME_Identification (new String[]{"EN", "Identification"}),
    ME_Content (new String[]{"EN", "Content"}),
    ME_InstitutionalMandate (new String[]{"EN", "Institutional mandate"}),
    ME_Comparability (new String[]{"EN", "Comparability"}),
    ME_StatisticalProcessing (new String[]{"EN", "Statistical processing"}),
    ME_DataQuality (new String[]{"EN", "Data quality"}),
    ME_Accessibility (new String[]{"EN", "Accessibility"}),
    ME_Maintenance (new String[]{"EN", "Maintenance"}),
    ME_Documents (new String[]{"EN", "Documents"}),
    ME_ResourceDimensions (new String[]{"EN", "Resource dimensions"}),
    ME_SpatialRepresentation (new String[]{"EN", "Spatial representation"}),
    ME_ReferenceSystem (new String[]{"EN", "Reference system"});

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
