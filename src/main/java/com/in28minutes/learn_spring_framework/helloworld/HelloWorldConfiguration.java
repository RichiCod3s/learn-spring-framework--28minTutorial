package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Record used to eliminate verbosity in creating Java Beans
// It automatically creates public accessor methods, constructor, equals, hashcode and toString methods
// Releases Java 16
  
record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Main Street", "LA"));

    }


    // how to use an existing bean managed by Spring (e.g. name and age above)

    // 1: Through method call
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    // 2: As a parameter
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }


    // using the address with the @Qualifier annotation
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier")Address address){
        return new Person(name, age, address);
    }
    
    // we can make our own custom name
    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("123 Fake St", "Singapore" );
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("Learning Road", "Berlin" );
    }



}
