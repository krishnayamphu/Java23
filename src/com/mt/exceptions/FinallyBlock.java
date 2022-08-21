package com.mt.exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            double result = 1 /0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.err.println("Your number can't /zero");
        } finally {
            System.out.println("Hello World");
            System.out.println("You've reached finally block");
        }
    }
}
