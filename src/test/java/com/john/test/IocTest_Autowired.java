package com.john.test;

import com.john.beans.Person;
import com.john.config.MainConfigOfAutowired;
import com.john.config.MainConfigOfPropertyValue;
import com.john.dao.UserDao;
import com.john.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest_Autowired {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        UserService bean = context.getBean(UserService.class);
        System.out.println(bean);

       /* UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao bean1 = context.getBean(UserDao.class);*/

        /*UserDao bean1 = context.getBean(UserDao.class);
        System.out.println(bean1);*/
        context.close();
    }
}
