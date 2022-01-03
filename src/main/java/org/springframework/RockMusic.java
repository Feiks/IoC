package org.springframework;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements  Music{
    @Override
    public String getSong() {
            return   "Это рок музыка, суки";
    }
}
