package com.mt.oops;

public class StaticDemo {
    static int x;  //static variable
    int y;  // non-static variable

    public static void test(){ //static method
        System.out.println("Test method");
    }

    public static void main(String[] args) {
        x=5;
        //y=10;
        System.out.println(x);

        test();
    }
}
