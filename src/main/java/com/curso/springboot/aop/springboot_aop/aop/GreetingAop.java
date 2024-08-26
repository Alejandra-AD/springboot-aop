package com.curso.springboot.aop.springboot_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class GreetingAop {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());


    @Pointcut("execution(* com.curso.springboot.aop.springboot_aop.services.GreetingService.sayHello(..))")
    public void sayHelloPointcut(){};

    @Before("sayHelloPointcut()")
    public void loggerBefore(JoinPoint joinPoint){

        String method = joinPoint.getSignature().getName();
        logger.info("Invocando: " + joinPoint.getSignature().getName());
        System.out.println( joinPoint.getSignature().getName() + " "+ Arrays.toString(joinPoint.getArgs()));



    }

}
