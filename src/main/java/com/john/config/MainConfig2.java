package com.john.config;

import com.john.beans.Man;
import com.john.beans.ManFactoryBean;
import com.john.beans.Person;
import com.john.beans.Women;
import com.john.condition.LinuxCondition;
import com.john.condition.WindowsCondition;
import com.john.registrar.MyImportBeanDefinitionRegistrar;
import com.john.selector.MyImportSelector;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@Import({Man.class, Women.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {
    //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Lazy
    @Bean
    public Person person() {
        System.out.println("bean已被创建。。。");
        return new Person("lisi", 14);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("bill gates", 65);
    }

    @Conditional(LinuxCondition.class)//按照一定条件判断，满足条件才注册bean
    @Bean("linus")
    public Person person02() {
        return new Person("linus", 55);
    }

    @Bean
    public ManFactoryBean manFactoryBean() {
        return new ManFactoryBean();
    }
}
