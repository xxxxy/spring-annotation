package com.john.registrar;

import com.john.beans.Yeti;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry               BeanDefinition的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean b = registry.containsBeanDefinition("com.john.beans.Child");
        boolean b1 = registry.containsBeanDefinition("com.john.beans.Older");
        if (b && b1) {
            //指定Bean定义的信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Yeti.class);
            rootBeanDefinition.setScope(SCOPE_PROTOTYPE);
            //注册一个自定义类名的bean
            registry.registerBeanDefinition("yeti", rootBeanDefinition);
        }
    }
}
