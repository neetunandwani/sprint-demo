package com.practice.springdemo.services;

import com.practice.inerfaces.Fortune;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortune {
    @Override
    public String getTodayFortune() {
        return "Today is your happy fortune day";
    }
}
