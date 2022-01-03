package org.springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Initializing the project");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying the project");
    }
        @Override
    public String getSong() {
        return   "Классическая музыка";
    }




}
