package com.sun.service.makedata.shanghai;

import com.sun.service.ZqlbService;
import com.sun.service.makedata.MakeDataProcessor;
import com.sun.service.makedata.Market;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ShangHaiMakeData
 * @Description TODO
 * Author sunhong
 * Date 2020-6-20 11:40
 **/
@Market(name = "ShangHai")
public class ShangHaiMakeData implements MakeDataProcessor, ApplicationContextAware , BeanFactoryPostProcessor {

    public static final String TYPE_NAME = "com.sun.service.makedata.shanghai.ZqlbShanghai";


    Map<String, Object> makeDataHandler = new ConcurrentHashMap<>();

    @Autowired
    ZqlbService zqlbService;



    public void doMake(String fsetcode, Date date){
        getOrginalData(fsetcode, date);
    }

    @Override
    public <T> T getOrginalData(String fsetcode, Date date) {
        //模拟获取落地表的数据
        //zqlbService.selectZqlbById(3);
        List<SHGHVo> lists = new ArrayList<>();
        lists.add(new SHGHVo("600883",10d,10d));
        lists.add(new SHGHVo("001213",10d,10d));
        lists.add(new SHGHVo("500150",10d,10d));
        lists.forEach((k)->{
            String zqlb = SHGHUtils.getZqlb(k.getZqdm());
            ((ShangHaiMakeDataStrategy) makeDataHandler.get(zqlb)).doMake(k);
        });
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(ZqlbShanghai.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            makeDataHandler.put(entry.getValue().getClass().getAnnotation(ZqlbShanghai.class).value(),entry.getValue());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        for (String definitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(definitionName);
            System.out.println("");
        }
    }
}
