package org.fao.fenix.commons.find.dto.filter;

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

}
