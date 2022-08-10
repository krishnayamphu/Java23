package com.mt.inheritance;
class Animal{
    String name;
}
class Bird extends Animal{
    String color;
}
class Sparrow extends Bird{
    void food(){
        System.out.println("Sparrow food is rice");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Sparrow s=new Sparrow();
        s.name="Brown Sparrow";
        s.color="Light Brown";

        System.out.println("Bird Name:"+s.name);
        System.out.println("Color:"+s.color);
        s.food();
    }
}
