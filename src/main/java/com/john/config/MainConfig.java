package com.john.config;

import com.john.beans.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(value = "com.john",useDefaultFilters = false,
        //excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
        /*excludeFilters = {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value = Controller.class)},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Repository.class})},*/
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyFilterType.class})})
public class MainConfig {
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public Person person() {
        return new Person("lisi", 14);
    }
}
