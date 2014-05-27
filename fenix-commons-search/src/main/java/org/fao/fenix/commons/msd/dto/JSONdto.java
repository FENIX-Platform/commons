package org.fao.fenix.commons.msd.dto;

import com.orientechnologies.orient.core.id.ORID;
import com.orientechnologies.orient.core.id.ORecordId;
import com.orientechnologies.orient.object.enhancement.OObjectProxyMethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
import javax.persistence.Version;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect({JsonMethod.NONE})
public class JSONdto {
    private ORID orid;
    @Version private Object oversion;


    @JsonProperty
    public String getRID() {
        return toString(getORID());
    }

    @JsonProperty
    public void setRID(String rid) {
        orid = toRID(rid);
    }

    public ORID getORID() {
        return orid==null && this instanceof Proxy ? ((OObjectProxyMethodHandler) ProxyFactory.getHandler((Proxy) this)).getDoc().getIdentity() : orid;
    }


    public static String toString (ORID rid) {
        return rid.getClusterId()+"_"+rid.getClusterPosition();
    }
    public static ORID toRID(String rid) {
        if (rid!=null) {
            int splitIndex = rid.indexOf('_');
            rid = splitIndex>0 ? '#'+rid.substring(0, splitIndex)+':'+rid.substring(splitIndex+1) : rid;
        }
        return new ORecordId(rid);
    }


}
