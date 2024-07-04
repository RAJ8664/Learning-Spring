package com.roy.raj.Learning.Spring.game;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
