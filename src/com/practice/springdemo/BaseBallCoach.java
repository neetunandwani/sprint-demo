package com.practice.springdemo;

import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;

import java.util.logging.Logger;

public class BaseBallCoach implements Coach {
    private Fortune fortune;
    private final static Logger logger = Logger.getLogger(BaseBallCoach.class.getName());

    public BaseBallCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut() {
        logger.info("cdfvfdvfgvgfbb");
        return "Spend 30 Minutes on Batting practice";
    }

    public void getMyFortune() {
        System.out.println(fortune.getTodayFortune());
    }
}
