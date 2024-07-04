package com.roy.raj.Learning.Spring.GameUsingSpring;

import com.roy.raj.Learning.Spring.game.GameRunner;
import com.roy.raj.Learning.Spring.game.GamingConsole;
import com.roy.raj.Learning.Spring.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game() {
        Pacman game = new Pacman();
        return game;
    }
    @Bean
    public GameRunner gamerunner(GamingConsole game) {
        GameRunner gr = new GameRunner(game);
        return gr;
    }

}
