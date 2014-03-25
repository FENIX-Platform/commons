package org.fao.fenix.commons.msd.dto.cl.type;

import org.fao.fenix.commons.msd.dto.cl.Code;
import org.fao.fenix.commons.msd.dto.cl.CodeSystem;

public class CycleCodeReferenceException extends Exception {
    private CodeSystem system;
    private Code code;

    public CycleCodeReferenceException(CodeSystem system, Code code) {
        this.system = system;
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public CodeSystem getSystem() {
        return system;
    }

    @Override
    public String getMessage() {
        return "Cycle reference identified for code '"+code.getCode()+"' in codelist '"+(system!=null ? system.getSystem() : code.getSystemKey())+"'. Only oriented graphs are supported.";
    }

}
