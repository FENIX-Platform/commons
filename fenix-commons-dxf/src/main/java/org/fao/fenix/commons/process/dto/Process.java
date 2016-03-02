package org.fao.fenix.commons.process.dto;


public class Process<T> {

    private String name;
    private T parameters;
    private StepId rid; //Optional result id for cached processes
    private StepId[] sid; //Optional source ids



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

    public StepId getRid() {
        return rid;
    }

    public void setRid(StepId rid) {
        this.rid = rid;
    }

    public StepId[] getSid() {
        return sid;
    }

    public void setSid(StepId[] sid) {
        this.sid = sid;
    }
}
