package com.sun.service.prototype;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @ClassName RefPrototype
 * @Description TODO
 * Author sunhong
 * Date 2020-6-27 18:46
 **/
@Service
public class RefPrototype implements InitializingBean {

    private ProService proService;

    @Autowired
    ProService2 proService2;


    @Autowired
    ApplicationContext applicationContext;




    @Override
    public void afterPropertiesSet() throws Exception {
        for (int i = 0; i < 10; i++) {
            //获得的是原先对象每次的地址值都不一样
            System.out.println(this.applicationContext.getBean(ProService.class));
        }
        System.out.println("==================");
        for (int i = 0; i < 10; i++) {
            //虽然proService2是原先模式,但是通过@Autowired注入的时候就是一个值
            System.out.println(proService2);
        }

    }
}
