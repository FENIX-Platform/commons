package org.fao.fenix.commons.process.dto;

public class StepId implements Comparable<StepId> {
    private String uid;
    private String version;


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

    //Utils
    public String getId() {
        return uid!=null ? (version!=null ? uid+'|'+version : uid) : null;
    }

    @Override
    public boolean equals(Object obj) {
        String objId = obj!=null && obj instanceof StepId ? ((StepId)obj).getId() : null;
        String id = getId();
        return id==objId || (id!=null && objId!=null && id.equals(objId));
    }

    @Override
    public int hashCode() {
        String id = getId();
        return id!=null ? id.hashCode() : 0;
    }

    @Override
    public int compareTo(StepId obj) {
        String objId = obj!=null && obj instanceof StepId ? ((StepId)obj).getId() : null;
        String id = getId();
        if (id==objId)
            return 0;
        else if (id==null)
            return -1;
        else if (objId==null)
            return 1;
        else
            return id.compareTo(objId);
    }
}
