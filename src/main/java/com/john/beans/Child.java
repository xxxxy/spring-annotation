package com.john.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Child {
    private Sugar sugar;

  /*  private Child(){
        System.out.println("Child无参构造器。。。");
    }*/

    //@Autowired
    private Child(@Autowired Sugar sugar){
        this.sugar = sugar;
        System.out.println("Child有参构造器1");
    }

    public Sugar getSugar() {
        return sugar;
    }

    /*@Autowired*/
    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }
}
