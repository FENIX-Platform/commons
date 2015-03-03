package org.fao.fenix.commons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:guido.barbaglia@fao.org">Guido Barbaglia</a>
 * @author <a href="mailto:guido.barbaglia@gmail.com">Guido Barbaglia</a>
 */
@Target(ElementType.FIELD)
public @interface Subject {

    @Override
    public String value();

}