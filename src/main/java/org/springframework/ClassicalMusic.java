package org.springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Initializing the project");
    }
    public void destroy(){
        System.out.println("Destroying the project");
    }
        @Override
    public String getSong() {
        return   "Классическая музыка";
    }




}
