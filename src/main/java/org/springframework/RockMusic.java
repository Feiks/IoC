package org.springframework;

public class RockMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Rock Music is Playing");
    }
}
