package org.fao.fenix.commons.msd.dto.full;

import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class DSDColumnSubject extends JSONEntity implements Serializable {

    private String uid;
    private String link;
    private Map<String, String> title;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }
}
