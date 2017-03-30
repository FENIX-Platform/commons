package org.fao.fenix.commons.utils.annotations.export;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Input {
    String value() default "";
}
