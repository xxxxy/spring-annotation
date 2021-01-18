package com.john.config;

import com.john.beans.Older;
import com.john.beans.Person;
import com.john.beans.Sugar;
import com.john.dao.UserDao;
import org.springframework.context.annotation.*;

@ComponentScan({"com.john.controller", "com.john.service", "com.john.dao", "com.john.beans"})
@Configuration
public class MainConfigOfAutowired {

    @Primary
    @Bean("userDao2")
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setLabel("2");
        return userDao;
    }

    @Bean
    public Older older(Sugar sugar) {
        Older older = new Older();
        older.setSugar(sugar);
        return older;
    }
}
