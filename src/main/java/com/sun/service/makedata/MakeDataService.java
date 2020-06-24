package com.sun.service.makedata;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName MakeDataService
 * @Description TODO
 * Author sunhong
 * Date 2020-6-20 11:45
 **/
@Service
public class MakeDataService implements ApplicationContextAware {

    Map<String,MakeDataProcessor> makeDataHandler = new ConcurrentHashMap<>();


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String,Object> marketMap = applicationContext.getBeansWithAnnotation(Market.class);
        marketMap.forEach((key,value)->{
            String market = value.getClass().getAnnotation(Market.class).name();
            makeDataHandler.put(market, (MakeDataProcessor) value);
        });
    }

    public void makeData(String fsetcode, Date date){

        makeDataHandler.forEach((key,value)->{
            value.doMake(fsetcode,date);
        });

    }
}
