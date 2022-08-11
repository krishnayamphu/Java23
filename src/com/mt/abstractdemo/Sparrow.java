package com.mt.abstractdemo;

public class Sparrow extends Animal{
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.sleep();
    }
    @Override
    void sleep() {
        System.out.println("Sparrow bird is sleeping on nest.");
    }
}
