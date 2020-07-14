package com.sun.configuration;

import com.sun.service.makedata.shanghai.ShangHaiConfig;
import com.sun.service.makedata.shengzhen.ShengZhenConfig;
import com.sun.service.makedata.zhongjinsuo.ZhongJinSuoConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MarketConfig
 * @Description TODO
 * Author sunhong
 * Date 2020-6-24 13:19
 **/
@PropertySource(value = "classpath:application.properties")
@Configuration
@ComponentScan  //不配置默认当前包com.sun.configuration
@Import({ShangHaiConfig.class,ShengZhenConfig.class,MyImportSelector.class})
@EnableTransactionManagement
public class RootConfig implements BeanFactoryAware {

    /**
     * 中金所的配置文件
     * @return
     */
    @Bean
    public ZhongJinSuoConfig zhongJinSuoConfig(){       //@bean的方式只能返回一个对象,如果该对象里面有注解ComponentScan注解扫描相关类,不会被扫描
        return new ZhongJinSuoConfig();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("被Cglib代理");
    }
}
