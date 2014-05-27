package org.fao.fenix.commons.msd.dto.type.dm;

import java.io.Serializable;

public enum DMCopyrightType implements Serializable {
	
	publicPolicy("public"), privatePolicy("private"), sharedPolicy("shared");

	private String code;
	private DMCopyrightType(String code) { this.code = code; }
	public String getCode() { return code; }

	//Utils
	public static DMCopyrightType getByCode(String code) {
		for (DMCopyrightType type : values())
			if (type.getCode().equals(code))
				return type;
		return null;
	}
}
