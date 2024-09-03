package com.curso.springboot.aop.springboot_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.curso.springboot.aop.springboot_aop.services.GreetingsPointcutService;

import java.util.Arrays;

@Order(1)
@Component
@Aspect
public class FooAop {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());


    @Before("sayHelloFooPointcut()")
    public void loggerBefore(JoinPoint joinPoint){
        

        String method = joinPoint.getSignature().getName();
        logger.info("Invocando Before desde FooAop: " + joinPoint.getSignature().getName());
        System.out.println( joinPoint.getSignature().getName() + " "+ Arrays.toString(joinPoint.getArgs()));
    }

}
