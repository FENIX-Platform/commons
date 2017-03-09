package org.fao.fenix.commons.utils.find;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Engine {
    String value() default "";
}
