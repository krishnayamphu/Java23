package com.mt.oops;

public class A {
    public A(){
        System.out.println("I am default constructor");
    }
    public A(String s){
        System.out.println(s+ " text printing");
    }
    public void test(){
        System.out.println("Testing something.");
    }

    public static void main(String[] args) {
        A a=new A();
        a.test();

        new A("Demo");
    }
}
