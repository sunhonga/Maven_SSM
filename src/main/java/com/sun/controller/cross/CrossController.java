package com.sun.controller.cross;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CrossController
 * @Description TODO
 * Author sunhong
 * Date 2020-7-9 17:03
 **/
//跨域请求的controller
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/cross")
public class CrossController {


    @CrossOrigin("http://domain2.com")
    @RequestMapping("/{id}")
    public String cross(@PathVariable String id){


        return "ss";
    }


}
