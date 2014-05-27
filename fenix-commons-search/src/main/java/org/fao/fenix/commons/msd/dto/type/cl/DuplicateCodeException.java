package org.fao.fenix.commons.msd.dto.type.cl;

import org.fao.fenix.commons.msd.dto.full.cl.Code;
import org.fao.fenix.commons.msd.dto.full.cl.CodeSystem;

public class DuplicateCodeException extends Exception {
    private CodeSystem system;
    private Code code;

    public DuplicateCodeException(CodeSystem system, Code code) {
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
        return "Duplicate code '"+code.getCode()+"' in codelist '"+(system!=null ? system.getSystem() : code.getSystemKey())+"'";
    }
}
