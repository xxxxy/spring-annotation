package com.john.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional(transactionManager = "")
    public void insert() {
        userDao.insert();
        System.out.println("数据插入成功。。。");
        int i = 10 / 0;
    }
}
