package com.john.test;

import com.john.beans.Person;
import com.john.beans.Yeti;
import com.john.config.MainConfig;
import com.john.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IocTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }
    }

    @Test
    public void test2() {
        System.out.println("--------IOC容器已创建-------");
        /*Object person = context.getBean("person");
        Object person1 = context.getBean("person");
        System.out.println(person == person1);*/
    }

    @Test
    public void test3() {
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        //Windows 10
        System.out.println(property);
        System.out.println(beansOfType);
    }

    @Test
    public void testImport() {
        getBeans(context);
        Yeti bean = context.getBean(Yeti.class);
        Yeti bean2 = context.getBean(Yeti.class);
        System.out.println(bean == bean2);

        Object manFactoryBean = context.getBean("manFactoryBean");
        System.out.println(manFactoryBean.getClass());

        Object manFactoryBean1 = context.getBean("&manFactoryBean");
        System.out.println(manFactoryBean1.getClass());
    }

    private void getBeans(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
