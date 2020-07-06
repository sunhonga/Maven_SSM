package com.sun.controller;


import com.sun.mapper.CszqxxMapper;
import com.sun.pojo.Cszqxx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @Autowired
    CszqxxMapper cszqxxMapper;

    @RequestMapping("zqlb1.do")
    @ResponseBody
    public String getCszqxx(){

        if (1<3)throw new NullPointerException("sss");
        return "";
    }
}
