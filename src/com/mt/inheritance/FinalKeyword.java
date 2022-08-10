package com.mt.inheritance;
final class ABC{ //can't extends/inherite this class

}
class AA{
    public final void test(){
        System.out.println("testing");
    }
}
public class FinalKeyword extends AA{
    private final int maxspeed=200;
    //can't override method
//    public void test(){
//        System.out.println("testing something");
//    }

    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        System.out.println(obj.maxspeed);
         //obj.maxspeed=250; //can't change value
        obj.test();
    }
}
