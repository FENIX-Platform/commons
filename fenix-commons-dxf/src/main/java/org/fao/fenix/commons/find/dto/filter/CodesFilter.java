package org.fao.fenix.commons.find.dto.filter;

import org.fao.fenix.commons.utils.JSONUtils;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.Collection;

public class CodesFilter {

    public String rid;
    public String uid;
    public String version;
    public Collection<String> codes;
    public String label;

    public Integer level;
    public Integer levels;


    public void setLevel(Integer level) {
        this.level = level!=null && level<1 ? null : level;
    }

    public void setLevels(Integer levels) {
        this.levels = levels!=null && levels<1 ? null : levels;
    }

    @Override
    public String toString() {
        try {
            return JSONUtils.toJSON(this);
        } catch (Exception ex) {
            CharArrayWriter buffer = new CharArrayWriter();
            ex.printStackTrace(new PrintWriter(buffer));
            return buffer.toString();
        }
    }
}
