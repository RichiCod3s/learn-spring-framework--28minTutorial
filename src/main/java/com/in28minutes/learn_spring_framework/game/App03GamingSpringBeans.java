package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {


    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }


}
