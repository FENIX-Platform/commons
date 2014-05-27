package org.fao.fenix.commons.msd.dto.full.cl;

import org.fao.fenix.commons.msd.dto.type.cl.CSHierarchyType;

public class CodeHierarchy extends CodeLink {

	private CSHierarchyType type;

	public CodeHierarchy() { }
	public CodeHierarchy(Code from, Code to) { super(from, to); }
	public CodeHierarchy(Code from, Code to, CSHierarchyType type) {
		this(from,to);
		this.type = type;
	}

	public CSHierarchyType getType() {
		return type;
	}
	public void setType(CSHierarchyType type) {
		this.type = type;
	}
	
	
	
	

}
