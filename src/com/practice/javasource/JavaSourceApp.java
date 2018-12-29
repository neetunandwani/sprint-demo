package com.practice.javasource;

import com.practice.inerfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSourceApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCounfiguration.class);

        Coach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkOut());
        swimCoach.getMyFortune();
        System.out.println(((SwimCoach) swimCoach).getEmail());
        System.out.println(((SwimCoach) swimCoach).getName());
        context.close();
    }
}
