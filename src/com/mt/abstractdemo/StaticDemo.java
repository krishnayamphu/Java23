package com.mt.abstractdemo;
interface Mobile{
    static void info(){
        System.out.println("Showing mobile info");
    }
}
class Samsung implements Mobile{
    public void test(){
        Mobile.info();
    }
}
public class StaticDemo {
    public static void main(String[] args) {
    Samsung s=new Samsung();
    s.test();
    }
}
