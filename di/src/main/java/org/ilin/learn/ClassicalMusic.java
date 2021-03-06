package org.ilin.learn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {}

    @PostConstruct
    private void doMyInit() {
        System.out.println("do PostConstruct" + this.getClass().getName());
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("do PreDestroy " + this.getClass().getName());
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String toString() {
        return getSong();
    }

}
