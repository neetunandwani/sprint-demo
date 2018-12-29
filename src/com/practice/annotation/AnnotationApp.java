package com.practice.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
        Person person = context.getBean("employee", Person.class);
        System.out.println(person.getName());
        person.getMyFortune();
//        Fortune baseCoach= context.getBean("badFortuneService",Fortune.class);
//        System.out.println(baseCoach.getTodayFortune());
        context.close();
    }
}
