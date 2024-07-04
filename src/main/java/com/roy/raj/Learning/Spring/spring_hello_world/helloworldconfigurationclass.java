package com.roy.raj.Learning.Spring.spring_hello_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//you can create your own custom classes with toString method in it;
record xpertPerson(String name, int age, Address adress) {}
record Person(String name, int age) {};
record Address(String country, String city) {}

@Configuration
public class helloworldconfigurationclass {

    @Bean
    public String name() {
        return "RAJ ROY";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        Person person1 = new Person("RAJ" , 22);
        return person1;
    }

    @Bean
    public Address address() {
        Address address1 = new Address("NEPAL" , "RAJBIRAJ");
        return address1;
    }

    @Bean
    public xpertPerson xpertperson(String name, int age, Address address) {
        xpertPerson person = new xpertPerson(name, age, address);
        return person;
    }
}
