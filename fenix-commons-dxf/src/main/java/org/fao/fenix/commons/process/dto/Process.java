package org.fao.fenix.commons.process.dto;

import java.util.Map;

public class Process<T> {

    private String name;
    private T parameters;
    private String rid; //Optional result id for cached processes
    private String[] sid; //Optional source ids



    public Process() {
    }

    public Process(String name) {
        this.name = name;
    }

    public Process(String name, T parameters) {
        this.name = name;
        this.parameters = parameters;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getParameters() {
        return parameters;
    }

    public void setParameters(T parameters) {
        this.parameters = parameters;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String[] getSid() {
        return sid;
    }

    public void setSid(String[] sid) {
        this.sid = sid;
    }
}
