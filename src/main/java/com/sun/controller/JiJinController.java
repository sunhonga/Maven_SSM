package com.sun.controller;

import com.sun.annotation.SunHongAnnotation;
import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JiJinController
 * @Description TODO
 * Author sunhong
 * Date 2020-3-31 16:15
 **/
@Controller
@RequestMapping()
@SunHongAnnotation(value = "${jdbc1.driver}")
public class JiJinController {

    @ResponseBody
    @RequestMapping("jiJin.do")
    public ModelAndView selectZqlbById(){

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","欢迎来到基金页面");
        mav.setViewName("jiJin");
        return mav;
    }
}
