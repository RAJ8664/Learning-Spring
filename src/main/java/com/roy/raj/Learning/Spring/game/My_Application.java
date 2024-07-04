package com.roy.raj.Learning.Spring.game;

import org.springframework.stereotype.Component;

@Component
public class My_Application {
    public static void main(String[] args) {

        Mario mario = new Mario(); // Object Creation;
        SuperContra superContra = new SuperContra();
        Pacman pacman = new Pacman();

        GameRunner mario_GR = new GameRunner(mario); //Object Creation + Wiring a Dependency(injecting a dependency)
        GameRunner superContra_GR = new GameRunner(superContra);
        GameRunner pacman_GR = new GameRunner(pacman);

        mario_GR.run();
        superContra_GR.run();
        pacman_GR.run();

    }
}
