package com.mt.exceptions;

import javax.swing.text.Style;
import java.util.Scanner;

public class ThrowsDemo {
    public void calc(int n) throws ArithmeticException
    {
        int num=50;
        System.out.println(num/n);
    }

    public static void main(String[] args) {
        ThrowsDemo th=new ThrowsDemo();
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number:");
            int n=sc.nextInt();
            th.calc(n);
        }catch (ArithmeticException e){
            System.err.println("You can't divide number by zero");
            System.err.println(e);
        }


    }
}
