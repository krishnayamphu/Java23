package com.mt.oops;

public class ThisDemo2 {
    public ThisDemo2(){
        System.out.println("default constructor");
    }
    public ThisDemo2(String s){
        this();
        System.out.println("Printing "+s);
    }

    public static void main(String[] args) {
        new ThisDemo2("Picture");
    }
}
