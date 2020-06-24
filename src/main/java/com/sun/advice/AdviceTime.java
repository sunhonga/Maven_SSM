package com.sun.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



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




    //@Before("pointCut1()")
    public void before(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println("开始执行:"+className+"."+methodName+"()方法...");
    }
    //访问命名切入点来应用后置通知
   // @AfterReturning("pointCut1()")
    public void afterReturn(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法正常执行结束...");
    }
    //应用最终通知
    //@After("pointCut1()")
    public void after(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()最终执行步骤(finally)...");
    }
    //应用异常抛出后通知
    //@AfterThrowing("pointCut1()")
    public void afterThrowing(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法抛出了异常...");
    }
    //应用周围通知
    @Around("pointCut1()")
    public Object doAround(ProceedingJoinPoint call) throws Throwable{
        Object result = null;
        this.before(call);//相当于前置通知
        try {
            result = call.proceed();
            this.afterReturn(call); //相当于后置通知
        } catch (Throwable e) {
            this.afterThrowing(call);  //相当于异常抛出后通知
            throw e;
        }finally{
            this.after(call);  //相当于最终通知
        }
        return result;
    }

}
