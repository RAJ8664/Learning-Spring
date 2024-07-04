package com.roy.raj.Learning.Spring.GameUsingSpringwithLesserCode;
import com.roy.raj.Learning.Spring.game.GameRunner;
import com.roy.raj.Learning.Spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.roy.raj.Learning.Spring.game")
public class Gaming {
    //add component annotation to not manually write the bean;
    //use component scan annotation to search the beans;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext content =
                new AnnotationConfigApplicationContext(Gaming.class);

        content.getBean(GamingConsole.class).up();
        content.getBean(GameRunner.class).run();
    }
}
