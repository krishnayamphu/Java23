package com.mt.abstractdemo;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Kitty";
        System.out.println("Cat name:"+cat.name);
        cat.eat();
        cat.sleep();
    }

    @Override
    void sleep() {
        System.out.println(" cat is sleeping");
    }
}
