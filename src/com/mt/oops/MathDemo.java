package com.mt.oops;

public class MathDemo {
    public void sum(int x, int y){
        System.out.println("Total sum:"+(x+y));
    }
    public double calcDiscount(double price, double discount){
        double discountAmount=price*(discount/100);
        return discountAmount;
    }

    public static void main(String[] args) {
        MathDemo m=new MathDemo();
        m.sum(10,4);

        System.out.println("Discount:"+m.calcDiscount(1000,5));
    }
}
