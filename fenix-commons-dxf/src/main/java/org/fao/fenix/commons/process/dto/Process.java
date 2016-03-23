package org.fao.fenix.commons.process.dto;


public class Process<T> implements Comparable<Process> {

    private String name;
    private T parameters;
    private StepId rid; //Optional result id for cached processes
    private StepId[] sid; //Optional source ids
    private boolean result = false;

    public int index;



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

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    //Utils

    @Override
    public boolean equals(Object obj) {
        return obj!=null && obj instanceof Process && ((Process) obj).index==index;
    }

    @Override
    public int hashCode() {
        return index;
    }

    @Override
    public int compareTo(Process o) {
        int otherIndex = o!=null ? o.index : -1;
        if (index==otherIndex)
            return 0;
        if (index>otherIndex)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}
