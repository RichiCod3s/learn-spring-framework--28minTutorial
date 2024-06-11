package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {


    public static void main(String[] args) {
        //1:Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2:Configure the things we want Spring to manage - @Configuration class
        // (HelloWorldConfiguration Class) - @configuration
        //name - @bean


        //3: retrieve Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean("person5Qualifier"));
        //you can also use the name of the class
      //  System.out.println(context.getBean(Address.class));

        /* When we use the below: if there is more than one Bean of the same class you will get an exception
         as Spring does not know which bean your referring to. We can make a Bean primary to resolve this */
        System.out.println(context.getBean(Person.class));


        // to get a list of all the bean names
       // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
