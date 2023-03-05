package com.example.recursionexample.recursionExample;

public class RecursionExample {

    public void sayHi(int count){
        System.out.println("Hi");
        if(count <= 1){
            return;
        }
        sayHi(count -1);
    }
}
