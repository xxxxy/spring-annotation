package com.john.test;

import com.john.beans.Person;
import com.john.config.MainConfigForLifeCyCle;
import com.john.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_PropertyValues {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        context.close();
    }
}
