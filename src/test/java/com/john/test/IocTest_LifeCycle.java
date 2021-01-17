package com.john.test;

import com.john.config.MainConfigForLifeCyCle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_LifeCycle {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigForLifeCyCle.class);
        System.out.println("容器初始化完成。。。");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //Object bike = context.getBean("bike");
        context.close();
    }
}
