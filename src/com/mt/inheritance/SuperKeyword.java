package com.mt.inheritance;

class Fruit {
    String color;
    String size;

    public Fruit(String fruitname) {
        System.out.println("Fruit constructor " + fruitname);
    }

    public void fruitInfo() {
        System.out.println("Showing fruit information");
    }
}

class Apple extends Fruit {
    public Apple(String fruitname) {
        super(fruitname);
    }

    public void getFruitInfo() {
        super.color = "Pink";
        super.size = "medium";
        super.fruitInfo();
        System.out.println("Apple color: " + super.color);
        System.out.println("Apple size: " + super.size);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Apple apple = new Apple("Apple");
        apple.getFruitInfo();
    }
}
