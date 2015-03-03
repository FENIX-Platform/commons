package org.fao.fenix.commons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:guido.barbaglia@fao.org">Guido Barbaglia</a>
 * @author <a href="mailto:guido.barbaglia@gmail.com">Guido Barbaglia</a>
 */
@Target(ElementType.PARAMETER)
public @interface Description {

    public String en();

    public String fr();

    public String es();

    public String ar();

    public String cn();

    public String ru();

}