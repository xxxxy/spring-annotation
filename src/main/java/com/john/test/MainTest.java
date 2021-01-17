package com.john.test;

import com.john.beans.Person;
import com.john.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ioc.getBean("person");
        System.out.println(person);*/
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);

        Person bean = ioc.getBean(Person.class);
        System.out.println(bean);

        String[] beanNamesForType = ioc.getBeanNamesForType(Person.class);
        System.out.println(beanNamesForType.length);

        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
