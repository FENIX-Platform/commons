package org.fao.fenix.commons.msd.dto.type;

import java.util.HashMap;
import java.util.Map;

public enum GeometricObjects {
    point (new String[]{"EN", "Point"}),
    linestring (new String[]{"EN", "LineString"}),
    polygon (new String[]{"EN", "Polygon"}),
    multipoint (new String[]{"EN", "MultiPoint"}),
    multilinestring (new String[]{"EN", "MultiLineString"}),
    multipolygon (new String[]{"EN", "MultiPolygon"});

    private Map<String,String> label = new HashMap<>();
    private GeometricObjects(String[]... labels) { //EN,FR,ES,PT
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
