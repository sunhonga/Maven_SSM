package com.sun.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

/**
 * @ClassName ZsunHongImpl1
 * @Description TODO
 * Author sunhong
 * Date 2020-6-27 14:11
 **/
@Service
//@Primary()
@Priority(1)
public class ZsunHongImpl1 implements ZsunHong {
}
