package com.john.test;

import com.john.beans.Child;
import com.john.beans.Older;
import com.john.beans.Sugar;
import com.john.config.MainConfigOfAutowired;
import com.john.config.MainConfigOfProfile;
import com.john.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class IocTest_profile {
    @Test
    public void test01() {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置要激活的环境
        context.getEnvironment().setActiveProfiles("sit","uat");
        //注册配置bean到容器
        context.register(MainConfigOfProfile.class);
        //刷新容器
        context.refresh();

        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        context.close();
    }
}
