package org.fao.fenix.commons.msd.dto.full;

//import org.codehaus.jackson.annotate.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeDataRevision extends JSONEntity implements Serializable {

    @JsonProperty
    private Map<String, String> revisionPolicy;
    @JsonProperty private Map<String, String> revisionPractice;


    public Map<String, String> getRevisionPolicy() {
        return revisionPolicy;
    }

    public void setRevisionPolicy(Map<String, String> revisionPolicy) {
        this.revisionPolicy = revisionPolicy;
    }

    public Map<String, String> getRevisionPractice() {
        return revisionPractice;
    }

    public void setRevisionPractice(Map<String, String> revisionPractice) {
        this.revisionPractice = revisionPractice;
    }
}
