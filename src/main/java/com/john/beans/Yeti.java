package com.john.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
@PropertySource(value = "classpath:myProperties.properties")
public class Yeti implements EnvironmentAware, BeanNameAware, ApplicationContextAware, EmbeddedValueResolverAware {
    @Override
    public void setEnvironment(Environment environment) {
        String property = environment.getProperty("os.name");
        System.out.println("属性值：" + property);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("IOC容器：" + applicationContext);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("爱好：${person.hobbit}---系统：${os.name}-----#{1+1}");
        System.out.println(s);
    }
}
