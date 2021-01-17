package com.john.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    /**
     * @param context  判断条件能使用的上下文（环境）
     * @param metadata 注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取到ioc使用的beanFactory（bean工厂）
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取到类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        System.out.println(registry.getBeanDefinition("bill"));
        //获取到当前环境信息
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(environment);
        return property.contains("Linux");
    }
}
