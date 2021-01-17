package com.john.beans;

public class Bike {
    public Bike() {
        System.out.println("Bike Bean 被构建了。。。");
    }

    public void init() {
        System.out.println("Bike Bean 初始化了。。。");
    }

    public void destroy() {
        System.out.println("Bike Bean 被销毁了。。。");
    }
}
