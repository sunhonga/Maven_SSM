package com.sun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @ClassName X
 * @Description TODO
 * Author sunhong
 * Date 2020-6-18 13:38
 **/
@Service
public class X {

    @Autowired
    Y y;

    @PostConstruct
    public void init(){
        System.out.println("X类初始化方法");
    }


    public X(){
        System.out.println("X被实例化");
    }
}
