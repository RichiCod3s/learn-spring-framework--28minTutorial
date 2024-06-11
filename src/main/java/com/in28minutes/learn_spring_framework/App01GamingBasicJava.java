package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacMan;

public class App01GamingBasicJava {


    public static void main(String[] args) {


        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacMan(); //1: Object creation

        var gameRunner = new GameRunner(game);
        //2: Object creation + wiring of dependencies
        // Game is a dependency of GameRunner

        gameRunner.run();
    }
}
