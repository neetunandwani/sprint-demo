package com.practice.springdemo;

import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;

public class HockeyCoach implements Coach {
    private Fortune fortune;

    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 1 hr to Hockey Practice";
    }

    @Override
    public void getMyFortune() {
        System.out.println(fortune.getTodayFortune());
    }
}
