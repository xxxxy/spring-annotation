package com.john.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "INSERT INTO test_user (username, age) VALUES (?, ?)";
        String userName = UUID.randomUUID().toString().substring(0,5);

        int sql1 = jdbcTemplate.update(sql, userName, 20);
        System.out.println(sql1);
    }
}
