package com.example.recursionexample;

import com.example.recursionexample.recursionExample.RecursionExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecursionExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(RecursionExampleApplication.class, args);
        RecursionExample recursionExample = new RecursionExample();
        recursionExample.sayHi(3);
    }

}
