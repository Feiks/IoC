package org.springframework;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public void getSong() {
        System.out.println( "%0 Cent Bitches");
    }
}
