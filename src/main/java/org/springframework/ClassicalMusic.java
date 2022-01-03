package org.springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Hungarian Rhapsody");
    }
}
