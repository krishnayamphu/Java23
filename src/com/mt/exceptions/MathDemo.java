package com.mt.exceptions;

public class MathDemo {
    public static void main(String[] args) {
        try {
            double n = 5;
            double i = 0;
            double result = 1/1;
            System.out.println(result);
            System.out.println("Hello World");
        } catch (ArithmeticException e) {
            System.err.println(e);
            System.err.println("Your number can't /zero")
            ;
        }

    }
}
