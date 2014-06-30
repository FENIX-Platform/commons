package org.fao.fenix.commons.msd.dto.templates.canc.dsd;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.fao.fenix.commons.msd.dto.templates.canc.cl.CodeSystem;
import org.fao.fenix.commons.msd.dto.type.dsd.DSDDataType;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DSDColumn {

	private String columnId;
	private DSDDataType dataType;
	private String geoLyer;
	private String virtualColumn;
    private Collection<Object> values;
	private Map<String,String> title;

    private Map<String,String> supplemental;
    private DSDDimension dimension;

    private CodeSystem codeSystem;
    private Integer codesLevel;


	//GET-SET
	public Map<String, String> getTitle() {
		return title;
	}
	public void setTitle(Map<String, String> title) {
		this.title = title;
	}
	public Map<String, String> getSupplemental() {
		return supplemental;
	}
	public void setSupplemental(Map<String, String> supplemental) {
		this.supplemental = supplemental;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public DSDDataType getDataType() {
		return dataType;
	}
	public void setDataType(DSDDataType dataType) {
		this.dataType = dataType;
	}
	public String getGeoLyer() {
		return geoLyer;
	}
	public void setGeoLyer(String geoLyer) {
		this.geoLyer = geoLyer;
	}
	public Integer getCodesLevel() {
		return codesLevel;
	}
	public void setCodesLevel(Integer codesLevel) {
		this.codesLevel = codesLevel;
	}
	public String getVirtualColumn() {
		return virtualColumn;
	}
	public void setVirtualColumn(String virtualColumn) {
		this.virtualColumn = virtualColumn;
	}
	public Collection<Object> getValues() {
		return values;
	}
	public void setValues(Collection<Object> values) {
		this.values = values;
	}
	public CodeSystem getCodeSystem() {
		return codeSystem;
	}
	public void setCodeSystem(CodeSystem codeSystem) {
		this.codeSystem = codeSystem;
	}
	public DSDDimension getDimension() {
		return dimension;
	}
	public void setDimension(DSDDimension dimension) {
		this.dimension = dimension;
	}
	
	
	//Utils
	public void addTitle(String language, String title) {
        if (this.title==null)
            this.title = new HashMap<String,String>();
		this.title.put(language, title);
	}
	public void addSupplemental(String language, String supplemental) {
        if (this.supplemental==null)
            this.supplemental = new HashMap<String,String>();
		this.supplemental.put(language, supplemental);
	}
	@JsonIgnore
	public void setDecodedDataType(String code) {
		dataType = DSDDataType.getByCode(code);
	}
	public void addValue(Object value) {
        if (values==null)
            values = new LinkedList<Object>();
		values.add(value);
	}
	@JsonIgnore
	public Object getSingleValue() {
		return values!=null && values.size()==1 ? values.iterator().next() : null;
	}
}
