package com.roy.raj.Learning.Spring.spring_hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class APP2_HELLO_WORLD_SPRING {
    public static void main(String[] args) {
        //configure the things that we want spring to manage --> @Configuration class;
        //figure out how to launch a spring content;
        AnnotationConfigApplicationContext content =
                new AnnotationConfigApplicationContext(helloworldconfigurationclass.class);

        //Retrieving Beans managed by spring;
        System.out.println(content.getBean("name"));
        System.out.println(content.getBean("age"));
        System.out.println(content.getBean("person"));
        System.out.println(content.getBean("address"));
        System.out.println(content.getBean("xpertperson"));
        System.out.println(Arrays.toString(content.getBeanDefinitionNames()));
        System.out.println(content.getBeanDefinitionCount());
    }
}
