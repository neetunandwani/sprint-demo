package com.practice.javasource;

import com.practice.inerfaces.Coach;
import com.practice.inerfaces.Fortune;
import com.practice.springdemo.services.RandomFortune;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Configuration
@PropertySource("classpath:application.properties")
public class AppCounfiguration {

    @Value("${root.logger.level}")
    String rootLooger;

    @Value("${print.logger.level}")
    String printLogger;

    //for spring 4.2 or lower property resolution
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

    @Bean
    Fortune randomFortune() {
        return new RandomFortune();
    }

    @Bean
    Coach swimCoach() {
        return new SwimCoach(randomFortune());
    }

    @PostConstruct
    public void initConfig() {
        Logger logger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName()).getParent();
        logger.setLevel(Level.parse(rootLooger));


        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.parse(printLogger));
        logger.addHandler(consoleHandler);
    }

}
