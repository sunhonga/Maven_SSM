package com.sun.service.makedata;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Market {

    String name() default "";
}
