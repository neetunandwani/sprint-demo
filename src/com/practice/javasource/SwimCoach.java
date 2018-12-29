package com.practice.javasource;


import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;
import org.springframework.beans.factory.annotation.Value;

import java.util.logging.Logger;

public class SwimCoach implements Coach {
    private final static Logger logger = Logger.getLogger(SwimCoach.class.getName());

    private Fortune fortune;

    @Value("${person.email}")
    private String email;

    @Value("${person.name}")
    private String name;

    public SwimCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut() {
        logger.fine("inside daily workout");
        return " Swim atleast 1000 meters a day";
    }

    @Override
    public void getMyFortune() {
        System.out.println(fortune.getTodayFortune());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
