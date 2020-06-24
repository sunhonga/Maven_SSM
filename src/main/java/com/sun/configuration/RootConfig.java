package com.sun.configuration;

import com.sun.service.makedata.shanghai.ShangHaiConfig;
import com.sun.service.makedata.shengzhen.ShengZhenConfig;
import org.springframework.context.annotation.*;

/**
 * @ClassName MarketConfig
 * @Description TODO
 * Author sunhong
 * Date 2020-6-24 13:19
 **/
@PropertySource(value = "classpath:application.properties")
@Configuration
@ComponentScan  //不配置默认当前包com.sun.configuration
@Import({ShangHaiConfig.class,MyImportSelector.class})
public class RootConfig {

    /**
     * 上海市场的配置文件
     * @return
     */
    @Bean
    public ShengZhenConfig shengZhenConfig(){       //@bean的方式只能返回一个对象,如果该对象里面有注解ComponentScan注解扫描相关类,不会被扫描
        return new ShengZhenConfig();
    }

}
