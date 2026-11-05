package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ac =
                new ClassPathXmlApplicationContext("application.xml");

        Car car = ac.getBean("c1", Car.class);

        car.drive();   // call method
    }
}