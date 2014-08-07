package org.fao.fenix.commons.msd.dto.full;

import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DataType;

import java.io.Serializable;
import java.util.Map;

public class DSDColumn extends JSONEntity implements Serializable {

    private String id;
    private Map<String, String> title;
    private Map<String, String> supplemental;

    private DSDColumnSubject subject;
    private DataType dataType;

    private Object[] values;
    private DSDDomain domain;
    private String columnLink;

    private Boolean key;
    private Boolean transposed;
    private Boolean virtual;


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

    public DSDColumnSubject getSubject() {
        return subject;
    }

    public void setSubject(DSDColumnSubject subject) {
        this.subject = subject;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public DSDDomain getDomain() {
        return domain;
    }

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
