package org.fao.fenix.commons.msd.dto.full;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DataType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DSDColumn extends JSONEntity implements Serializable {

    @JsonProperty private String id;
    @JsonProperty private Map<String, String> title;
    @JsonProperty private Map<String, String> supplemental;

    @JsonProperty private String subject;
    @JsonProperty private DataType dataType;

    @JsonProperty private DSDDomain values;
    @JsonProperty private DSDDomain domain;
    @JsonProperty private String columnLink;

    @JsonProperty private Boolean key;
    @JsonProperty private Boolean transposed;
    @JsonProperty private Boolean virtual;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getTitle() {
        return title;
    }

    public void setTitle(Map<String, String> title) {
        this.title = title;
    }

    public Map<String, String> getSupplemental() {
        return supplemental;
    }

    public void setSupplemental(Map<String, String> supplemental) {
        this.supplemental = supplemental;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public DSDDomain getValues() {
        return values;
    }
    @Embedded
    public void setValues(DSDDomain values) {
        this.values = values;
    }

    public DSDDomain getDomain() {
        return domain;
    }
    @Embedded
    public void setDomain(DSDDomain domain) {
        this.domain = domain;
    }

    public String getColumnLink() {
        return columnLink;
    }

    public void setColumnLink(String columnLink) {
        this.columnLink = columnLink;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public Boolean getTransposed() {
        return transposed;
    }

    public void setTransposed(Boolean transposed) {
        this.transposed = transposed;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }
}
