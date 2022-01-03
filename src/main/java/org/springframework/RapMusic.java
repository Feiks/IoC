package org.springframework;

import org.springframework.stereotype.Component;

//@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "%0 Cent Bitches";
    }
}
