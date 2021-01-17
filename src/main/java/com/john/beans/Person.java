package com.john.beans;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("zhangsan")
    private String name;

    @Value("#{19-3}")
    private Integer age;

    @Value("${person.hobbit}")
    private String hobbit;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbit='" + hobbit + '\'' +
                '}';
    }
}
