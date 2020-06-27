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

/*    //该方法获取的bean是单例的
    @Autowired
    ProService proService;*/


    private ProService proService;

    @Autowired
    ApplicationContext applicationContext;


    public ProService createProService(){

        return this.applicationContext.getBean(ProService.class);           //通过改方法获取的bean是原型,
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.applicationContext.getBean(ProService.class));
        }

    }
}
