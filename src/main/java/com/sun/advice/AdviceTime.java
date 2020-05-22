package com.sun.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * @ClassName AdviceTime
 * @Description TODO
 * Author sunhong
 * Date 2020-5-21 13:53
 **/

@Aspect
@Component
public class AdviceTime {

    @Pointcut("execution(* com.sun..*(..))")
    public void pointCut1(){}




    //环绕通知
    @Around("pointCut1()")
    public Object arroundTime(ProceedingJoinPoint pjp){
        Object rtn = null;
        String mname = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        Long timeStart = System.currentTimeMillis();
        System.out.println("开始时间:"+timeStart);
        System.out.println("方法名："+mname+"参数列表"+ Arrays.toString(args));
        try{
            rtn = pjp.proceed();
        }catch (Throwable e){
            //异常处理
            System.out.println("方法名："+mname+"参数列表"+ Arrays.toString(args) +e.getMessage());
        }finally {
            Long timeEnd = System.currentTimeMillis();
            System.out.println("结束时间:"+timeEnd);
            System.out.println("公共耗时"+(timeEnd-timeStart));
        }
        return rtn;
    }

}
