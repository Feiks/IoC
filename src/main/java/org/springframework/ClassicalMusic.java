package org.springframework;

public class ClassicalMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Hungarian Rhapsody");
    }
}
