package com.practice.springdemo;

import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;

public class TrackCoach implements Coach {
    private Fortune fortune;

    public TrackCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes on Running";
    }

    @Override
    public void getMyFortune() {
        System.out.println(fortune.getTodayFortune());
    }
}
