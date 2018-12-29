package com.practice.annotation;

import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Person implements Coach {
    @Autowired
    @Qualifier("randomFortune")
    private Fortune fortune;

//    @Autowired
//    public Person(@Qualifier("happyFortuneService") Fortune fortune) {
//        this.fortune = fortune;
//        this.name = "neetu";
//    }

    @Value("${person.name}")
    private String name;
//
//    Person() {
//        this.name = "neetu";
//    }

    public String getName() {
        return name;
    }
//
//    public void setFortune( Fortune fortune) {
//        this.fortune = fortune;
//    }
//
//    public Fortune getFortune() {
//        return fortune;
//    }

    @Override
    public String getDailyWorkOut() {
        return "0000";
    }

    @Override
    public void getMyFortune() {
        System.out.println(fortune.getTodayFortune());
    }
}
