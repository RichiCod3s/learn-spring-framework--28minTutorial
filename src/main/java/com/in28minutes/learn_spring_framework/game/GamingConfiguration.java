package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public  GamingConsole game(){
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    //var game = new MarioGame();
    //var game = new SuperContraGame();
  //  var game = new PacMan(); //1: Object creation

   // var gameRunner = new GameRunner(game);
    //2: Object creation + wiring of dependencies
    // Game is a dependency of GameRunner

       // gameRunner.run();
}
