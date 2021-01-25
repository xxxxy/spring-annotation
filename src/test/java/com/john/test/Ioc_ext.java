package com.john.test;

import com.john.beans.Person;
import com.john.beans.Yeti;
import com.john.config.MainConfig;
import com.john.config.MainConfig2;
import com.john.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class Ioc_ext {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);

        context.close();
    }
}
