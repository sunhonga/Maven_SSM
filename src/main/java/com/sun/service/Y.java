package com.sun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @ClassName Y
 * @Description TODO
 * Author sunhong
 * Date 2020-6-18 13:38
 **/
@Service
public class Y {


    @Autowired
    X x;

    @PostConstruct
    public void init(){
        System.out.println("Y类初始化方法");
    }

    public Y(){
        System.out.println("Y被初始化");

    }
}
