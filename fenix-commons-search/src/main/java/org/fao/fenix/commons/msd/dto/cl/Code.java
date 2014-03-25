package org.fao.fenix.commons.msd.dto.cl;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.fao.fenix.commons.msd.dto.cl.type.DuplicateCodeException;
import org.fao.fenix.commons.msd.dto.common.ValueOperator;

import java.util.*;
import java.util.regex.Matcher;

public class Code implements Comparable<Code> {
	
	//Attributes
	private String code;
	private CodeSystem system;
	private Integer level;

	private Map<String,String> title;
	private Map<String,String> description;
	private Map<String,String> supplemental;
    private Date fromDate;
    private Date toDate;

	private Collection<ValueOperator> aggregationRules;

	//Tree connections
	@JsonIgnore
	public Set<Code> parents;
	private Set<Code> childs;
	
	//Matching rules
	private Collection<CodeRelationship> relations;
	private Collection<CodeConversion> conversions;
	private Collection<CodePropaedeutic> propaedeutics;

	//Code other management
	private Collection<Code> exclusionList = null; //null means standard code

	
	public Code() {}
	public Code(String composedCode) {
        this(getDecomposedCode(composedCode));
	}
    public Code(String[] codeParts) {
        this(codeParts[0],codeParts[1],codeParts[2]);
    }
	public Code(String system, String version, String code) {
        this (new CodeSystem(system,version), code);
	}
	public Code(CodeSystem system, String code) {
        this.code = code;
        setSystem(system);
	}


	//GET-SET
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@JsonBackReference("system") public CodeSystem getSystem() {
		return system;
	}
	@JsonBackReference("system") public void setSystem(CodeSystem system) {
		if ((this.system = system)!=null) {
			systemKey = system.getSystem();
			systemVersion = system.getVersion();
		} else {
            systemKey = null;
            systemVersion = null;
        }
	}

    public Date getFromDate() {
        return fromDate;
    }
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    public Date getToDate() {
        return toDate;
    }
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    public Collection<Code> getExclusionList() {
		return exclusionList;
	}
	public void setExclusionList(Collection<Code> exclusionList) {
		this.exclusionList = exclusionList;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Map<String, String> getTitle() {
		return title;
	}
	public void setTitle(Map<String, String> title) {
		this.title = title;
	}
	public Map<String, String> getDescription() {
		return description;
	}
	public void setDescription(Map<String, String> description) {
		this.description = description;
	}
	public Map<String, String> getSupplemental() {
		return supplemental;
	}
	public void setSupplemental(Map<String, String> supplemental) {
		this.supplemental = supplemental;
	}
	public Collection<Code> getChilds() {
		return childs;
	}
	public void setChilds(Collection<Code> childs) throws DuplicateCodeException {
		if (childs!=null) {
            this.childs = new HashSet<>();
            for (Code child : childs)
                addChild(child);
        } else
            this.childs = null;
	}
	@JsonIgnore
	public Collection<Code> getParents() {
		return parents;
	}

//	@JsonBackReference("linkRelationship")
	public Collection<CodeRelationship> getRelations() {
		return relations;
	}
//	@JsonBackReference("linkRelationship")
	public void setRelations(Collection<CodeRelationship> match) {
		this.relations = match;
	}
//	@JsonBackReference("linkConversion")
	public Collection<CodeConversion> getConversions() {
		return conversions;
	}
//	@JsonBackReference("linkConversion")
	public void setConversions(Collection<CodeConversion> conversions) {
		this.conversions = conversions;
	}
//	@JsonBackReference("linkPropaedeutic")
	public Collection<CodePropaedeutic> getPropaedeutics() {
		return propaedeutics;
	}
//	@JsonBackReference("linkPropaedeutic")
	public void setPropaedeutics(Collection<CodePropaedeutic> propaedeutics) {
		this.propaedeutics = propaedeutics;
	}
	public String getGlobalCode() {
		return systemKey+'|'+systemVersion+'|'+code;
	}
	public Collection<ValueOperator> getAggregationRules() {
		return aggregationRules;
	}
	public void setAggregationRules(Collection<ValueOperator> aggregationRules) {
		this.aggregationRules = aggregationRules;
	}


	//JSON utils
	private String systemKey;
	private String systemVersion;
	
	public String getSystemKey() { return systemKey; }
	public void setSystemKey(String systemKey) { this.systemKey = systemKey; }
	
	public String getSystemVersion() { return systemVersion; }
	public void setSystemVersion(String systemVersion) { this.systemVersion = systemVersion; }
	
	
	//Utilities
	@JsonIgnore public static String[] getDecomposedCode(String compositCode) { return compositCode!=null ? compositCode.split("|") : null; }
	public void addTitle(String language, String title) {
        if (this.title==null)
            this.title = new HashMap<String, String>();
		this.title.put(language, title);
	}
	public void addDescription(String language, String description) {
        if (this.description==null)
            this.description = new HashMap<String, String>();
		this.description.put(language, description);
	}
	public void addSupplemental(String language, String supplemental) {
        if (this.supplemental==null)
            this.supplemental = new HashMap<String, String>();
		this.supplemental.put(language, supplemental);
	}
	public void addChild(Code child) throws DuplicateCodeException {
        if (childs==null)
            childs = new HashSet<>();
        if (!childs.add(child))
            throw new DuplicateCodeException (system,child);
        child.addParent(this);
    }
	public void addParent(Code parent) throws DuplicateCodeException {
		if (parents==null)
			parents = new HashSet<>();
        if (!parents.add(parent))
            throw new DuplicateCodeException (system,parent);
	}
	public void addExclusion(Code toExclude) {
		if (exclusionList==null)
			exclusionList = new LinkedList<>();
		exclusionList.add(toExclude);
	}
	public void addAggregationRule(ValueOperator aggregationRule) {
        if (aggregationRules==null)
            aggregationRules = new LinkedList<>();
		aggregationRules.add(aggregationRule);
	}
	public void addRelation(CodeRelationship rule) {
        if (relations==null)
            relations = new LinkedList<>();
		relations.add(rule);
	}
	public void addConversion(CodeConversion conversion) {
        if (conversions==null)
            conversions = new LinkedList<>();
		conversions.add(conversion);
	}
	public void addPropaedeutic(CodePropaedeutic prop) {
        if (propaedeutics==null)
            propaedeutics = new LinkedList<>();
		propaedeutics.add(prop);
	}
	@JsonIgnore public boolean isSemanticOther() { return exclusionList!=null && exclusionList.size()>0; }
	
	@JsonIgnore public boolean isLeaf() { return childs==null || childs.size()==0; }
	@JsonIgnore public boolean isRoot() { return parents==null || parents.size()==0; }
	public Collection<Collection<Code>> findBranches() {
		return findBranches(true, new LinkedList<Collection<Code>>(), new LinkedList<Code>());
	}
	private Collection<Collection<Code>> findBranches(boolean isRoot, Collection<Collection<Code>> buffer, LinkedList<Code> branchBuffer) {
		branchBuffer.add(this);
		if (isLeaf())
			buffer.add(new LinkedList<Code>(branchBuffer));
		else
			for (Code child : childs)
				child.findBranches(false, buffer, branchBuffer);
		branchBuffer.removeLast();
		return buffer;
	}

    //Code list normalization utilities
    protected int resetLevel(int parentLevel) {
        level = parentLevel+1;
        int depth = level;
        if (childs!=null)
            for (Code child: childs)
                depth = Math.max(depth, child.resetLevel(level));
        return depth;
    }
    protected void resetSystem (CodeSystem system) {
        setSystem(system);
        if (childs!=null)
            for (Code child: childs)
                child.resetSystem(system);
    }
    protected void addParentNoCheck(Code parent) {
        if (parents==null)
            parents = new HashSet<>();
        parents.add(parent);
    }
    protected void addChildNoCheck(Code child) {
        if (childs==null)
            childs = new HashSet<>();
        childs.add(child);
    }


	//Ordering
	@Override
	public int hashCode() {
		return getGlobalCode().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return obj!=null && obj instanceof Code && getGlobalCode().equals(((Code)obj).getGlobalCode());
	}
	@Override
	public int compareTo(Code obj) {
		return getGlobalCode().compareTo(obj.getGlobalCode());
	}

	
	//utils
	@Override public String toString() { return getGlobalCode(); }
}
