package com.sun.service.makedata;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName MarketCondition
 * @Description TODO
 * Author sunhong
 * Date 2020-6-23 16:28
 **/
public class MarketCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
