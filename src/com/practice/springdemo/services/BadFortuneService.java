package com.practice.springdemo.services;

import com.practice.inerfaces.Fortune;
import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements Fortune {
    @Override
    public String getTodayFortune() {
        return "Its your bad fortune day";
    }
}
