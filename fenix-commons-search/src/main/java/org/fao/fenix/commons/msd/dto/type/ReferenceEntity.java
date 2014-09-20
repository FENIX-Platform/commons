package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum ReferenceEntity {
    ME_Identification,
    ME_Content,
    ME_InstitutionalMandate,
    ME_Comparability,
    ME_StatisticalProcessing,
    ME_DataQuality,
    ME_Accessibility,
    ME_Maintenance,
    ME_Documents,
    ME_ResourceDimensions,
    ME_SpatialRepresentation,
    ME_ReferenceSystem;

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
