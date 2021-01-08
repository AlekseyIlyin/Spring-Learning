package org.ilin.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    @Override
    public String toString() {
        return getSong();
    }

}
