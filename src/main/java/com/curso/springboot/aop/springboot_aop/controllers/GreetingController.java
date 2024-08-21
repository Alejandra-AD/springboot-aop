package com.curso.springboot.aop.springboot_aop.controllers;

import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.aop.springboot_aop.services.GreetingService;

@RestController
@RequestMapping("/app")
public class GreetingController {

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting(){
        return ResponseEntity.ok().body(Collections.singletonMap("greeting","Hola!"));
    }

    

}
