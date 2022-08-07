package com.mt.oops;

public class ThisDemo {
    private int x;
    private int y;
    public void test(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void sum(){
        int sum=40+5;
        System.out.println("Total sum: "+sum);
    }
    public void calc(){
        //sum(); //this.sum();
        this.sum();
    }
    public static void main(String[] args) {
        ThisDemo ob=new ThisDemo();
        ob.test(10,5);
        System.out.println("value of x is: "+ob.x);
        System.out.println("value of y is: "+ob.y);
        ob.calc();
    }
}
