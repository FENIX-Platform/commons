package org.fao.fenix.commons.msd.dto.full.cl;

import org.fao.fenix.commons.msd.dto.full.common.ValueOperator;
import org.fao.fenix.commons.msd.dto.full.common.ValueOperator;

public class CodeConversion extends CodeLink {

	private ValueOperator conversionRule;
		
	public CodeConversion() { }
	public CodeConversion(Code from, Code to) { super(from, to); }
	public CodeConversion(Code from, Code to, ValueOperator conversionRule) {
		this(from,to);
		this.conversionRule = conversionRule;
	}

	
	
	public ValueOperator getConversionRule() {
		return conversionRule;
	}
	public void setConversionRule(ValueOperator conversionRule) {
		this.conversionRule = conversionRule;
	}
	
	
	

}
