package com.john.test;

import com.john.aop.MyCalculater;
import com.john.beans.Child;
import com.john.beans.Older;
import com.john.beans.Sugar;
import com.john.config.MainConfigOfAop;
import com.john.config.MainConfigOfAutowired;
import com.john.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_Aop {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MyCalculater bean = context.getBean(MyCalculater.class);
        bean.div(1,0);
        context.close();
    }
}
