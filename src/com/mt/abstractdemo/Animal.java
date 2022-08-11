package com.mt.abstractdemo;

public abstract class Animal {
    String name;
    void eat(){
        System.out.println("Eating food");
    }
    abstract void sleep();
}
