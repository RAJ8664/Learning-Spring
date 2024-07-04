package com.roy.raj.Learning.Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole {
    public void up() {
        System.out.println("UP");
    }
    public void down() {
        System.out.println("DOWN");
    }
    public void left() {
        System.out.println("left");
    }
    public void right() {
        System.out.println("right");
    }
}
