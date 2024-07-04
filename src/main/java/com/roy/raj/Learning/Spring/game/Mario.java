package com.roy.raj.Learning.Spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {
    public void up() {
        System.out.println("JUMP");
    }
    public void down() {
        System.out.println("SIT DOWN");
    }
    public void left() {System.out.println("GO Left");}
    public void right() {
        System.out.println("Accelerate");
    }
}
