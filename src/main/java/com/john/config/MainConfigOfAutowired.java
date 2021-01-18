package com.john.config;

import com.john.beans.Person;
import com.john.dao.UserDao;
import org.springframework.context.annotation.*;

@ComponentScan({"com.john.controller", "com.john.service", "com.john.dao"})
@Configuration
public class MainConfigOfAutowired {

    @Primary
    @Bean("userDao2")
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setLabel("2");
        return userDao;
    }
}
