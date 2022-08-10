package com.mt.inheritance;
class Car{
    String brand;
    String model;
    String engineType;
    String color;
}
class Toyota extends Car{
    public void run(){
        System.out.println("Running toyota car");
    }
}
class Hundai extends Car{
    public void run(){
        System.out.println("Running hundai car");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.brand="Toyota";
        toyota.engineType="Std";
        toyota.color="Red";
        System.out.println("Car Brand: "+toyota.brand+"\nCar Engine Typ:"+toyota.engineType+"\nColor:"+toyota.color);
        toyota.run();

        Hundai hundai=new Hundai();
        hundai.brand="Toyota";
        hundai.engineType="Std";
        hundai.color="Red";
        System.out.println("Car Brand: "+hundai.brand+"\nCar Engine Typ:"+hundai.engineType+"\nColor:"+hundai.color);
        hundai.run();
    }
}
