package org.fao.fenix.commons.find.dto.filter;

public class IdFilter {
    public String uid;
    public String version;

    public IdFilter() {

    }
    public IdFilter(String uid, String version) {
        this.uid = uid;
        this.version = version;
    }
}
