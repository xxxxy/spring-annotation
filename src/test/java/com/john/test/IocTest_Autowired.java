package com.john.test;

import com.john.beans.Person;
import com.john.config.MainConfigOfAutowired;
import com.john.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_Autowired {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        context.close();
    }
}
