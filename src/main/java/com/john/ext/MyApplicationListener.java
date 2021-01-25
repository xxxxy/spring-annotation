package com.john.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("查看事件：" + event);
        if (event.getSource().equals("my event")) {
            System.out.println("监听到的事件：" + event.getSource());
        }
    }
}
