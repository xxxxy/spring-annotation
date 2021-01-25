package com.john.ext;

import com.john.beans.Bike;
import com.john.beans.Rabbit;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry执行");

        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);

        //方式1：直接使用RootBeanDefinition创建BeanDefinition
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Bike.class);
        registry.registerBeanDefinition("Hello", rootBeanDefinition);

        /*
        //方式2：使用BeanDefinitionBuilder创建BeanDefinition
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Rabbit.class);
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();*/

        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanFactory执行");
    }
}
