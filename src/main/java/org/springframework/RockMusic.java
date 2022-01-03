package org.springframework;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements  Music{
    @Override
    public void getSong() {
        System.out.println("Это рок - музыка , суки");
    }
}
