package com.example.recursionexample;

import com.example.recursionexample.fibonacciExample.FibonacciExample;
import com.example.recursionexample.recursionExample.RecursionExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecursionExampleApplication {

    private static long[] fibonacciCache;

    public static void main(String[] args) {

        SpringApplication.run(RecursionExampleApplication.class, args);
        RecursionExample recursionExample = new RecursionExample();
        recursionExample.sayHi(3);
//        --------------------------------------------------------------------------------------

        int n = 9;
        fibonacciCache = new long[n + 1];
        FibonacciExample fibonacciExample = new FibonacciExample();
        System.out.println(fibonacciExample.fibonacci(n));
    }

}
