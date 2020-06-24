package com.sun.service.makedata.shanghai;



import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ZqlbShanghai {

    String value() default "";
}
