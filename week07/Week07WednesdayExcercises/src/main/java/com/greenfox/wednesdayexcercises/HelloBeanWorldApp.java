package com.greenfox.wednesdayexcercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApp implements CommandLineRunner {

    @Autowired
    Printer printer;
    @Autowired
    MyColor color;

    public static void main(String[] args) {

        SpringApplication.run(HelloBeanWorldApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        color.printColor();

    }
}
