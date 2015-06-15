package org.fao.fenix.commons.msd.dto.full;

//import org.codehaus.jackson.annotate.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.mdsd.annotations.Description;
import org.fao.fenix.commons.mdsd.annotations.Format;
import org.fao.fenix.commons.mdsd.annotations.Label;
import org.fao.fenix.commons.mdsd.annotations.Order;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.io.Serializable;
import java.util.Map;

public class SeDataRevision extends JSONEntity implements Serializable {

    @JsonProperty
    @Label(en="Revision policy",fr="Politique de révision",es="Política de revisiones")
    @Description(en= "Policy concerning the periodically revision of the resource and ensuring the transparency of disseminated data.")
    @Order(1)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> revisionPolicy;

    @JsonProperty
    @Label(en="Revision practice",fr="Pratique de la révision des données",es="Prácticas Fecha de revisión")
    @Description(en= "Information concerning the revision of data in order to give compilers the possibility of incorporating new and more accurate information in the resource. It also describes the revision status of available data. Data may also be subject to regular or ad hoc revisions as a result of the introduction of new classification, compilation frameworks and methodologies in order to improve the accuracy of the resource.")
    @Order(2)
    @Format(Format.FORMAT.textarea)
    private Map<String, String> revisionPractice;


    public Map<String, String> getRevisionPolicy() {
        return revisionPolicy;
    }

    public void setRevisionPolicy(Map<String, String> revisionPolicy) {
        this.revisionPolicy = revisionPolicy;
    }

    public Map<String, String> getRevisionPractice() {
        return revisionPractice;
    }

    public void setRevisionPractice(Map<String, String> revisionPractice) {
        this.revisionPractice = revisionPractice;
    }
}
