package org.fao.fenix.commons.msd.dto.templates.codeList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fao.fenix.commons.msd.dto.templates.ResponseBeanFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;

public class CodeList {

    @JsonProperty private MeIdentification metadata;
    @JsonProperty private Collection<Code> data;

    public static Collection<CodeList> getInstances(Collection<org.fao.fenix.commons.msd.dto.full.CodeList> sources) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Collection<CodeList> codeLists = new LinkedList<>();
        for (org.fao.fenix.commons.msd.dto.full.CodeList sourceCodeList : sources)
            codeLists.add(getInstance(sourceCodeList));
        return codeLists;
    }
    public static CodeList getInstance(org.fao.fenix.commons.msd.dto.full.CodeList source) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new CodeList(
                ResponseBeanFactory.getInstance(source.getMetadata(), MeIdentification.class),
                ResponseBeanFactory.getInstances(source.getData(), Code.class)
        );
    }



    public CodeList() { }
    public CodeList(MeIdentification metadata, Collection<Code> data) {
        this.metadata = metadata;
        this.data = data;
    }


    public MeIdentification getMetadata() {
        return metadata;
    }

    public Collection<Code> getData() {
        return data;
    }
}
