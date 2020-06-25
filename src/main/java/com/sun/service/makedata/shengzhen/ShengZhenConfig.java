package com.sun.service.makedata.shengzhen;

import com.sun.service.makedata.Market;
import com.sun.service.makedata.MarketCondition;
import org.springframework.context.annotation.Conditional;

/**
 * @ClassName ShengZhenConfig
 * @Description TODO
 * Author sunhong
 * Date 2020-6-24 13:41
 **/
@Conditional({MarketCondition.class})
public class ShengZhenConfig {
}
