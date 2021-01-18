package com.john.test;

import com.john.beans.Child;
import com.john.beans.Older;
import com.john.beans.Person;
import com.john.beans.Sugar;
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

        Child bean1 = context.getBean(Child.class);
        Sugar sugar = bean1.getSugar();
        System.out.println(sugar);
        Sugar bean2 = context.getBean(Sugar.class);
        System.out.println(bean2);

        Older bean3 = context.getBean(Older.class);
        System.out.println(bean3);

        System.out.println("context容器：" + context);
        context.close();
    }
}
