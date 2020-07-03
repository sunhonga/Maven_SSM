package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

/**
 * @ClassName TestController
 * @Description TODO
 * Author sunhong
 * Date 2020-7-2 13:07
 **/
@Controller
@RequestMapping(value = "/test")
public class TestController {


    @RequestMapping("/testRb.do")
    @ResponseBody
    public Employee testRb(@RequestBody Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObj.do")
    @ResponseBody
    public Employee testCustomObj(Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObjWithRp.do")
    @ResponseBody
    public Employee testCustomObjWithRp(@RequestParam Employee e) {
        return e;
    }

    @RequestMapping("/testDate.do")
    @ResponseBody
    public Date testDate(Date date) {
        return date;
    }
}

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}