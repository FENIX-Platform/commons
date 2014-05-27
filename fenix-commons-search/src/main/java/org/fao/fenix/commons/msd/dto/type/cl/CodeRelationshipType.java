package org.fao.fenix.commons.msd.dto.type.cl;


public enum CodeRelationshipType {
	
	oneToOne("OO"), oneToMany("OM"), manyToOne("MO");
	
	private String code;
	private CodeRelationshipType(String code) { this.code = code; }
	public String getCode() { return code; }
	
	public static CodeRelationshipType getByCode(String code) {
		for (CodeRelationshipType type : values())
			if (type.getCode().equals(code))
				return type;
		return null;
	}

}
