package com.practice.springdemo.services;

import com.practice.inerfaces.Fortune;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortune implements Fortune {
    private String[] randomFortunes = new String[]{"Good", "Bad", "Worse", "Best", "Better"};
//    private String[] randomFortunes;

    public void setRandomFortunes(String[] randomFortunes) {
        this.randomFortunes = randomFortunes;
    }

    @Override
    public String getTodayFortune() {
        Random random = new Random();
        return "Today is your " + randomFortunes[random.nextInt(randomFortunes.length)] + " day";
    }
}
