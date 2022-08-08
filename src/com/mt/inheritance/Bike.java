package com.mt.inheritance;
class Vehicle{
    String name;
    String brand;
}
public class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.name="Honda cbr250";
        bike.brand="Honda";

        System.out.println("Bike name: "+bike.name);
        System.out.println("Bike model: "+bike.brand);
    }
}
