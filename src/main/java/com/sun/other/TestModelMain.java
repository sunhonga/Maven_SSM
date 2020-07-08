package com.sun.other;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestModelMain
 * @Description TODO
 * Author sunhong
 * Date 2020-7-8 17:04
 **/
public class TestModelMain {


    public static void main(String[] args) {

        //demo1();
        //demo2();
        //demo3();
    }

    private static void demo3() {
        TestModel tm = new TestModel();
        BeanWrapper bw = new BeanWrapperImpl(tm);
        bw.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
        bw.setPropertyValue("birth", "1990-01-01");
        System.out.println(tm);
    }

    private static void demo2() {
        TestModel tm = new TestModel();
        BeanWrapperImpl bw = new BeanWrapperImpl(false);
        bw.setWrappedInstance(tm);
        bw.setPropertyValue("good", "1");
        System.out.println(tm);
    }

    private static void demo1() {
        TestModel testModel = new TestModel();
        BeanWrapper beanWrapper = new BeanWrapperImpl(testModel);
        beanWrapper.setPropertyValue("good","on");
        System.out.println(testModel);
    }
}
