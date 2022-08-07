package com.mt.oops;
class Bike{
    public void start(){
        System.out.println("Starting Bike.");
    }
    public void run(){
        System.out.println("Running bike smoothly.");
    }
    public int maxSpeed(){
        return 140;
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        Bike honda=new Bike();
        honda.start();
        honda.run();
        System.out.println("Maximum speed:"+honda.maxSpeed());
    }
}
