package com.practice.springdemo;

import com.practice.inerfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = applicationContext.getBean("myCoach", Coach.class);
        Coach hockeyCoach = applicationContext.getBean("coach", Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(hockeyCoach.getDailyWorkOut());
        coach.getMyFortune();
        hockeyCoach.getMyFortune();
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.getEmail());
        Coach trackCoach = applicationContext.getBean("trackCoach", TrackCoach.class);
        trackCoach.getMyFortune();

        //bean scope
        Coach copyCoach = applicationContext.getBean("myCoach", Coach.class);
        System.out.println(copyCoach==coach);
        System.out.println(coach);
        System.out.println(copyCoach);

        applicationContext.close();
    }
}
