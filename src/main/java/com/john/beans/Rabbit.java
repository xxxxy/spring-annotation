package com.john.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Rabbit implements ApplicationContextAware {
    public ApplicationContext applicationContext;

    public Rabbit() {
        System.out.println("Rabbit Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Rabbit...@PostConstruct...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Rabbit...@PreDestroy...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
