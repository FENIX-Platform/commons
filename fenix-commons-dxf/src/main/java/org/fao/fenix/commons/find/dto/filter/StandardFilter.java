package org.fao.fenix.commons.find.dto.filter;

import org.fao.fenix.commons.utils.JSONUtils;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class StandardFilter extends LinkedHashMap<String, FieldFilter> {

    //Utils
    public String toString() {
        try {
            StringBuilder buffer = new StringBuilder();
            for (Map.Entry<String, FieldFilter> entry : entrySet())
                buffer.append("\n\t").append(entry.getKey()).append(": ").append(JSONUtils.toJSON(entry.getValue()));
            buffer.append('\n');
            return buffer.toString();
        } catch (Exception ex) {
            CharArrayWriter buffer = new CharArrayWriter();
            ex.printStackTrace(new PrintWriter(buffer));
            return buffer.toString();
        }
    }

}
