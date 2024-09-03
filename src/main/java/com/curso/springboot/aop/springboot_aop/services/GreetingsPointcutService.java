package com.curso.springboot.aop.springboot_aop.services;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class GreetingsPointcutService {

    @Pointcut("execution(* GreetingService.sayHello(..))")
    public void sayHelloPointcut(){};

    @Pointcut("execution(* GreetingService.sayHello(..))")
    public void sayHelloFooPointcut(){};



}
