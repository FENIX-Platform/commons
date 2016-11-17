package org.fao.fenix.commons.find.dto.filter;

import java.util.Collection;
import java.util.LinkedList;

public class VariableFilter {

    private boolean global = true;
    private Collection<Variable> variables = new LinkedList<>();

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public Collection<Variable> getVariables() {
        return variables;
    }

    public void setVariables(Collection<Variable> variables) {
        this.variables = variables;
    }
}
