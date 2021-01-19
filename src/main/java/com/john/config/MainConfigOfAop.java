package com.john.config;

import com.john.aop.MyAspect;
import com.john.aop.MyCalculater;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAop {
    @Bean
    public MyCalculater myCalculater() {
        return new MyCalculater();
    }

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
