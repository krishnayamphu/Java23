package com.mt.oops;

public class Vehicle {
    public void start(){
        System.out.println("starting vehicle");
    }
    public void run(){
        System.out.println("running vehicle smoothly");
    }

    public void test(Vehicle v){
        v.start();
        v.run();
    }
    public void demo(){
        test(this);
    }

    public Vehicle getVehicle(){
        return this;
    }
    public static void main(String[] args) {
        new Vehicle().demo();
    }
}
