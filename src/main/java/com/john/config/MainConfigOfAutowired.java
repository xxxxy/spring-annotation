package com.john.config;

import com.john.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan({"com.john.controller", "com.john.service", "com.john.dao"})
@Configuration
public class MainConfigOfAutowired {
    @Bean
    public Person person() {
        return new Person();
    }
}
