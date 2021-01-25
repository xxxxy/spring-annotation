package com.john.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @EventListener(classes = ApplicationEvent.class)
    public void listen1(ApplicationEvent event) {
        System.out.println("注解方式监听：" + event);
    }
}
