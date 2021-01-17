package com.john.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 在bean 初始化之前执行
     *
     * @param bean     bean对象
     * @param beanName bean名称
     * @return bean对象或者包装后的对象
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName + "--->" + bean);
        return bean;
    }

    /**
     * 在bean 初始化之后执行
     *
     * @param bean     bean对象
     * @param beanName bean名称
     * @return bean对象或者包装后的对象
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName + "--->" + bean);
        return bean;
    }
}
