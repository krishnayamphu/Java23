package com.mt.oops;
class MyMath{
    public void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }
    public void sum(int x, int y, int z){
        System.out.println("Total sum: "+(x+y+z));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MyMath math=new MyMath();
        math.sum(10,5);
        math.sum(10,5,10);
    }
}
