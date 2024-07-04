package com.roy.raj.Learning.Spring.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com.roy.raj.Learning.Spring.exercise")
public class BusinessCalculationService {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BusinessCalculationService.class);
        System.out.println(Arrays.toString(context.getBean(DataService.class).retrieveData()));
        System.out.println(context.getBean(DataService.class).find_maxi());

    }
}
