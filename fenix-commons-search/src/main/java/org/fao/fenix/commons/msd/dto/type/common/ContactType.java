package org.fao.fenix.commons.msd.dto.type.common;


public enum ContactType {
	
	mail("mail"), email("email"), mobile("mobile"), phone("phone"), address("address");
	
	private String code;
	private ContactType(String code) { this.code = code; }
	public String getCode() { return code; }
	
	public static ContactType getByCode(String code) {
		for (ContactType type : values())
			if (type.getCode().equals(code))
				return type;
		return null;
	}

}
