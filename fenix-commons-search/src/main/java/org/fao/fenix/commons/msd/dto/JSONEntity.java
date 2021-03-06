package org.fao.fenix.commons.msd.dto;

import com.orientechnologies.orient.core.id.ORID;
import com.orientechnologies.orient.core.id.ORecordId;
import com.orientechnologies.orient.object.enhancement.OObjectProxyMethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Version;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class JSONEntity {
    private ORID orid;
    @Version private Object oVersion;


    @JsonProperty
    public String getRID() {
        return toString(getORID());
    }

    @JsonProperty
    public void setRID(String rid) {
        orid = rid!=null && rid.trim().length()>0 ? toRID(rid) : null;
    }

    public ORID getORID() {
        return orid==null && this instanceof Proxy ? ((OObjectProxyMethodHandler) ProxyFactory.getHandler((Proxy) this)).getDoc().getIdentity() : orid;
    }
    public void setORID(ORID orid) {
        this.orid = orid;
    }

    //Utils
    public static String toString (ORID rid) {
        return rid!=null && rid.getClusterId()>0 ? rid.getClusterId()+"_"+rid.getClusterPosition() : null;
    }
    public static ORID toRID(String rid) {
        try {
            int splitIndex = rid.indexOf('_');
            return new ORecordId("#"+Integer.parseInt(rid.substring(0, splitIndex))+':'+Integer.parseInt(rid.substring(splitIndex+1)));
        } catch (Exception ex) {
            return null;
        }
    }

    //Compare


    @Override
    public boolean equals(Object obj) {
        ORID orid1 = getORID();
        ORID orid2 = obj!=null ? ((JSONEntity)obj).getORID() : null;

        return orid1!=null && orid2!=null && orid1.getClusterId()>0 && orid2.getClusterId()>0 && orid1.equals(orid2);
    }

    @Override
    public int hashCode() {
        ORID orid = getORID();
        return orid!=null && orid.getClusterId()>0 ? orid.hashCode() : 0;
    }

}
