package com.john.test;


import com.john.tx.MainTxConfig;

import com.john.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_Tx {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainTxConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.insert();
        context.close();
    }
}
