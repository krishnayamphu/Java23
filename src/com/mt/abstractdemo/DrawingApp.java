package com.mt.abstractdemo;
interface Shape{
    void draw();
}
interface Graphics{
    void fillColor(String color);
}
class Circle implements Shape,Graphics{

    @Override
    public void draw() {
        System.out.println("Drawing Circle Shape");
    }

    @Override
    public void fillColor(String color) {
        System.out.println("shape is filling with "+color+" color");
    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle Shape");
    }
}
public class DrawingApp {
    public static void main(String[] args) {
        Circle circle=new Circle();
//        Shape circle=new Circle();
        circle.draw();
        circle.fillColor("Red");

//        Rectangle rectangle=new Rectangle();
        Shape rectangle=new Rectangle();
        rectangle.draw();
    }
}
