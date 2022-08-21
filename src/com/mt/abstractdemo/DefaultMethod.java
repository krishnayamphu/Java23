package com.mt.abstractdemo;
interface Bank{
    default void info() {
        System.out.println("This is default method");
    }
}
class NMB implements Bank{
}
public class DefaultMethod {
    public static void main(String[] args) {
        NMB bank=new NMB();
        bank.info();
    }
}
