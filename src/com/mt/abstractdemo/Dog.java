package com.mt.abstractdemo;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.sleep();
    }

    @Override
    void sleep() {
        System.out.println("dog is sleeping");
    }
}
