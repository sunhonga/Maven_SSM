package com.sun.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @ClassName MyGlobalExceptionHandler
 * @Description TODO
 * Author sunhong
 * Date 2020-7-6 17:04
 **/
@ControllerAdvice(value ="com.sun.controller" ,annotations = ResponseBody.class)
public class MyGlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public ModelAndView nullException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage()+"你大爷空指针异常了");
        mv.setViewName("myerror");
        return mv;
    }

    @ResponseBody
    @ExceptionHandler(IOException.class)
    public ModelAndView ioException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage()+"IO异常了");
        mv.setViewName("myerror");
        return mv;
    }

}
