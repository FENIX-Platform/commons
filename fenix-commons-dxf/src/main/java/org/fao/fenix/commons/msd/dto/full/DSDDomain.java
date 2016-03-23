package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.JSONEntity;
import org.fao.fenix.commons.msd.dto.type.DataType;

import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.*;

public class DSDDomain extends JSONEntity implements Serializable {

    @JsonProperty private Collection<OjCodeList> codes;
    @JsonProperty private Collection<String> enumeration;
    @JsonProperty private Period period;
    @JsonProperty private Collection<Long> timeList;


    public Collection<OjCodeList> getCodes() {
        return codes;
    }
    @Embedded
    public void setCodes(Collection<OjCodeList> codes) {
        this.codes = codes;
    }

    public Collection<String> getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Collection<String> enumeration) {
        this.enumeration = enumeration;
    }

    public Period getPeriod() {
        return period;
    }
    @Embedded
    public void setPeriod(Period period) {
        this.period = period;
    }

    public Collection<Long> getTimeList() {
        return timeList;
    }

    public void setTimeList(Collection<Long> timeList) {
        this.timeList = timeList;
    }


    @Override
    public DSDDomain clone() {
        DSDDomain clone = new DSDDomain();

        clone.setEnumeration(getEnumeration()!=null ? new LinkedList<>(getEnumeration()) : null);
        clone.setTimeList(getTimeList()!=null ? new LinkedList<>(getTimeList()) : null);
        clone.setPeriod(getPeriod()!=null ? getPeriod().clone() : null);
        clone.setCodes(cloneCodes());

        return clone;
    }

    private Collection<OjCodeList> cloneCodes() {
        Collection<OjCodeList> clone = null;
        if (getCodes()!=null) {
            clone = new LinkedList<>();
            for (OjCodeList codeList : getCodes())
                clone.add(codeList.clone());
        }
        return clone;
    }


    public boolean extend(DataType columnType, DSDDomain domain) {
        if (columnType!=null && domain!=null)
            switch (columnType) {
                case code:
                    {
                        Collection<OjCodeList> codeLists = getCodes();
                        OjCodeList codeList = codeLists!=null && codeLists.size()>0 ? codeLists.iterator().next() : null;
                        String uid = codeList!=null ? codeList.getIdCodeList() : null;
                        String version = codeList!=null ? codeList.getVersion() : null;

                        Collection<OjCodeList> domainCodeLists = domain.getCodes();
                        OjCodeList domainCodeList = domainCodeLists!=null && domainCodeLists.size()>0 ? domainCodeLists.iterator().next() : null;
                        String domainUid = domainCodeList!=null ? domainCodeList.getIdCodeList() : null;
                        String domainVersion = domainCodeList!=null ? domainCodeList.getVersion() : null;

                        if (uid==null || domainUid==null || !uid.equals(domainUid) || (version!=null && (domainVersion==null || !version.equals(domainVersion))) || (version==null && domainVersion!=null) )
                            return false;

                        Collection<OjCode> codes = codeList.getCodes();
                        Collection<OjCode> domainCodes = domainCodeList.getCodes();
                        if (codes!=null && codes.size()>0 && domainCodes!=null && domainCodes.size()>0) {
                            Set<String> codesValue = new HashSet<>();
                            for (OjCode code : codes)
                                codesValue.add(code.getCode());
                            for (OjCode code : domainCodes)
                                if (!codesValue.contains(code.getCode()))
                                    codes.add(code);
                        }
                    }
                    break;
                case customCode:
                    {
                        Collection<OjCodeList> codeLists = getCodes();
                        OjCodeList codeList = codeLists!=null && codeLists.size()>0 ? codeLists.iterator().next() : null;
                        Collection<OjCode> codes = codeList!=null ? codeList.getCodes() : null;

                        Collection<OjCodeList> domainCodeLists = domain.getCodes();
                        OjCodeList domainCodeList = domainCodeLists!=null && domainCodeLists.size()>0 ? domainCodeLists.iterator().next() : null;
                        Collection<OjCode> domainCodes = domainCodeList!=null ? domainCodeList.getCodes() : null;

                        if (codes==null || domainCodes==null)
                            return false;

                        Set<String> codesValue = new HashSet<>();
                        for (OjCode code : codes)
                            codesValue.add(code.getCode());
                        for (OjCode code : domainCodes)
                            if (!codesValue.contains(code.getCode()))
                                codes.add(code);
                    }
                    break;
                case enumeration:
                    {
                        Collection<String> enumeration = getEnumeration();
                        Collection<String> domainEnumeration = getEnumeration();

                        if (enumeration==null || domainEnumeration==null)
                            return false;

                        enumeration = new LinkedHashSet<>(enumeration);
                        enumeration.addAll(domainEnumeration);
                        setEnumeration(enumeration);
                    }
                    break;
                case year:
                case month:
                case date:
                case time:
                    Collection<Long> timeList = getTimeList();
                    if (timeList!=null && timeList.size()>0) {
                        Collection<Long> domainTimeList = domain.getTimeList();
                        if (domainTimeList!=null && domainTimeList.size()>0) {
                            timeList.addAll(domainTimeList);
                            setTimeList(new TreeSet<>(timeList));
                        } else
                            setTimeList(null);
                        setPeriod(null);
                    } else {
                        Period period = getPeriod();
                        Long from = period!=null ? period.getFrom() : null;
                        Long to = period!=null ? period.getTo() : null;
                        Period domainPeriod = domain.getPeriod();
                        Long domainFrom = domainPeriod!=null ? period.getFrom() : null;
                        Long domainTo = domainPeriod!=null ? period.getTo() : null;

                        from = from!=null && domainFrom!=null ? Math.min(from,domainFrom) : null;
                        to = to!=null && domainTo!=null ? Math.max(to,domainTo) : null;
                        setPeriod(from!=null || to!=null ? new Period(from, to) : null);
                        setTimeList(null);
                    }
                    break;
            }
        return true;
    }
}
