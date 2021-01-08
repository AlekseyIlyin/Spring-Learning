package org.ilin.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {}

    @PostConstruct
    public void doMyInit() {
        System.out.println("do My Initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("do My Distruction");
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
