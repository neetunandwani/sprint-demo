package com.practice.inerfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface Fortune {

    String getTodayFortune();

//    @PostConstruct
//    default void init() {
//        System.out.println("post construct called" + this);
//    }
//
//    @PreDestroy
//    default void destroy() {
//        System.out.println("pre destroy called" + this);
//    }
}
