package com.john.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Aspect:告诉spring，这个类是一个切面
 */
@Aspect
public class MyAspect {
    /**
     * Pointcut:切点。指定切面作用到的哪个类上的哪个方法。
     */
    @Pointcut("execution(public int com.john.aop.MyCalculater.*(..))")
    public void pointCut() {
    }

    //目标方法执行前执行
    @Before(value = "execution(public int com.john.aop.MyCalculater.div(..))")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "方法开始。。。参数：" + Arrays.asList(joinPoint.getArgs()));
    }

    //目标方法执行后执行
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "方法结束。。。");
    }

    //目标方法正常返回后执行
    @AfterReturning(value = "com.john.aop.MyAspect.pointCut()", returning = "result")
    public void logReturning(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "方法正常返回。。。返回值:" + result);
    }

    //目标方法抛异常时执行
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getSignature().getName() + "方法发生异常。。。异常信息：" + exception.getMessage());
    }
}
