package com.john.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Dog implements InitializingBean, DisposableBean {

    public Dog() {
        System.out.println("dog constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dog... destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Dog...afterPropertiesSet...");
    }
}
