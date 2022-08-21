package com.mt.exceptions;

public class ThrowDemo {
    public void voterAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            throw new ArithmeticException("You are under age");
        }
    }

    public static void main(String[] args) {
        ThrowDemo td=new ThrowDemo();
        try{
            td.voterAge(10);
        }catch (ArithmeticException e){
            System.err.println("You can't vote");
        }
    }
}
