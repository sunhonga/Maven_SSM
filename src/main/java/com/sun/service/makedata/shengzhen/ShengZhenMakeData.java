package com.sun.service.makedata.shengzhen;

import com.sun.service.makedata.MakeDataProcessor;
import com.sun.service.makedata.Market;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Date;

/**
 * @ClassName ShengZhenMakeData
 * @Description TODO
 * Author sunhong
 * Date 2020-6-20 11:47
 **/
@Market(name = "ShengZhen")
public class ShengZhenMakeData implements MakeDataProcessor, ApplicationContextAware {


    @Override
    public <T> T getOrginalData(String fsetcode, Date date) {
        return null;
    }

    @Override
    public void doMake(String fsetcode, Date date) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
