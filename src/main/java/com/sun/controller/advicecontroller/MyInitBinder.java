package com.sun.controller.advicecontroller;

import com.sun.pojo.Cszqxx;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @ClassName MyInitBinder
 * @Description TODO
 * Author sunhong
 * Date 2020-7-7 10:44
 **/

@ControllerAdvice
public class MyInitBinder {


    @InitBinder
    public void mybinder(WebDataBinder binder){
        binder.registerCustomEditor(Cszqxx.class,new CustomCszqxxEditor());
        binder.registerCustomEditor(String.class,new StringTrimEditor());
    }
}
