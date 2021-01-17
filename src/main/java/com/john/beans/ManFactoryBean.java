package com.john.beans;

import org.springframework.beans.factory.FactoryBean;

public class ManFactoryBean implements FactoryBean<Man> {
    @Override
    public Man getObject() throws Exception {
        return new Man();
    }

    /**
     * 获取Bean的类型
     *
     * @return bean类型
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 创建的Bean是否单例
     *
     * @return true：单例；false：多实例。
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
