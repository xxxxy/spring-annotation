package com.john.ext;

import com.john.beans.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.john.ext")
@Configuration
public class ExtConfig {
    @Bean
    public Bike bike() {
        return new Bike();
    }
}
