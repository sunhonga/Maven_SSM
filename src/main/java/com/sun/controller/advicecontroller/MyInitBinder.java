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

@ControllerAdvice       //可以指定对于那些包下的controller使用自定义的属性绑定,默认是全局生效
public class MyInitBinder {


    @InitBinder
    public void mybinder(WebDataBinder binder){
        binder.registerCustomEditor(Cszqxx.class,new CustomCszqxxEditor());
        binder.registerCustomEditor(String.class,new StringTrimEditor());
    }
}
