package com.john.config;

import com.john.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:myProperties.properties")
@Configuration
public class MainConfigOfPropertyValue {
    @Bean
    public Person person() {
        return new Person();
    }
}
