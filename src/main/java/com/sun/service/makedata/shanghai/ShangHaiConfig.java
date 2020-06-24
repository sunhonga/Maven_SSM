package com.sun.service.makedata.shanghai;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @ClassName ShangHaiConfig
 * @Description TODO
 * Author sunhong
 * Date 2020-6-21 12:24
 **/
/*
@Component
*/
/*
@Conditional({MarketCondition.class})
*/
@ComponentScan(value = "com.sun.service.makedata.shanghai",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {ZqlbShanghai.class})})
public class ShangHaiConfig {
}
