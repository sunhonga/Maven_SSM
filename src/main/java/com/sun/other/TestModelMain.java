package com.sun.other;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName TestModelMain
 * @Description TODO
 * Author sunhong
 * Date 2020-7-8 17:04
 **/
public class TestModelMain {

    private static volatile int a;

    private int age;

    public void writer(){
        age=21;
        a++;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                a++;
            }).start();
        }

        //demo1();
        //demo2();
        //demo3();
        List<TestModel> lists = new LinkedList<>();
        lists.add(new TestModel(18,"sun"));
        lists.add(new TestModel(48,"sun1"));
        lists.add(new TestModel(28,"sun111"));
        lists.add(new TestModel(38,"sun11"));
        lists.add(new TestModel(38,"sun1"));
        System.out.println(lists);
        Collections.sort(lists, new Comparator<TestModel>() {
            @Override
            public int compare(TestModel o1, TestModel o2) {
                if (o1.getAge()>o2.getAge()) {
                    return 1;
                }else if (o1.getAge() == o2.getAge()){
                   return o1.getName().length()>o2.getName().length() ? 1:-1;
                }
                return -1;
            }
        });
        System.out.println(lists);

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
