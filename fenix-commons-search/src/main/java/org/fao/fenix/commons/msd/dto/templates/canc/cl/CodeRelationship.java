package org.fao.fenix.commons.msd.dto.templates.canc.cl;

import org.fao.fenix.commons.msd.dto.type.cl.CodeRelationshipType;

public class CodeRelationship extends CodeLink {

	private CodeRelationshipType type;

	public CodeRelationship() { }
	public CodeRelationship(Code from, Code to) { super(from, to); }
	public CodeRelationship(Code from, Code to, CodeRelationshipType type) {
		this(from,to);
		this.type = type;
	}

	public CodeRelationshipType getType() {
		return type;
	}
	public void setType(CodeRelationshipType type) {
		this.type = type;
	}
	
	

}
