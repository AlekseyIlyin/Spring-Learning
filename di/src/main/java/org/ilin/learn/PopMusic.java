package org.ilin.learn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PopMusic implements Music {

    @PostConstruct
    private void init() {
        System.out.println("do PostConstruct" + this.getClass().getName());
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return getSong();
    }

}
