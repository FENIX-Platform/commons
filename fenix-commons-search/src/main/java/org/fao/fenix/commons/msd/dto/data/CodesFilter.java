package org.fao.fenix.commons.msd.dto.data;

import java.util.Collection;

public class CodesFilter {

    private String rid;
    private String uid;
    private String version;
    private Collection<String> codes;

    private Integer level = 1;
    private Integer levels = 1;


    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Collection<String> getCodes() {
        return codes;
    }

    public void setCodes(Collection<String> codes) {
        this.codes = codes;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level!=null && level>0 ? level : 1;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels!=null && levels>0 ? levels : 1;
    }
}
