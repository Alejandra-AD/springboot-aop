package com.curso.springboot.aop.springboot_aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{

    @Override
    public String sayHello(String person, String phrase) {
        System.out.println("desde metodo sayHello()");
        return "Saludos desde el método sayHello() del service GreetingService: " + " " + phrase + " " + person;
        
    }

}