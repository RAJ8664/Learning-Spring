package com.roy.raj.Learning.Spring.GameUsingSpring;

import com.roy.raj.Learning.Spring.game.GameRunner;
import com.roy.raj.Learning.Spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Gaming {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content =
                new AnnotationConfigApplicationContext(GameConfiguration.class);

        content.getBean(GamingConsole.class).up();
        content.getBean(GameRunner.class).run();
    }


}
