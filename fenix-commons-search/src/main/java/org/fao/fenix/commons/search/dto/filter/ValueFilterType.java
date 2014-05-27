package org.fao.fenix.commons.search.dto.filter;

import org.fao.fenix.commons.msd.dto.type.dsd.DSDDataType;

import java.util.Collection;
import java.util.LinkedList;

public enum ValueFilterType {
	numberInterval(DSDDataType.number),
	dateInterval(DSDDataType.date, DSDDataType.month, DSDDataType.year),
	like(DSDDataType.text),
	text(DSDDataType.text),
	iLike(DSDDataType.iText),
	iText(DSDDataType.iText),
	code(DSDDataType.code),
	document(DSDDataType.document),
    enumeration(DSDDataType.enumeration),
    customCode(DSDDataType.customCode),
	unknown;
	
	private DSDDataType[] dataTypeScope;
	private ValueFilterType(DSDDataType... dataTypeScope) { this.dataTypeScope = dataTypeScope; }
	
	public DSDDataType[] getScope() { return dataTypeScope; }
	public boolean hasScope(DSDDataType type) {
		for (DSDDataType t : dataTypeScope)
			if (t==type)
				return true;
		return false;
	}
	
	public static Collection<ValueFilterType> findByScope(DSDDataType type) {
		Collection<ValueFilterType> result = new LinkedList<ValueFilterType>();
		for (ValueFilterType filterType : ValueFilterType.values())
			if (filterType.hasScope(type))
				result.add(filterType);
		return result;
	}
}
