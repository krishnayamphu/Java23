package com.mt.basic;

import java.io.IOException;
import java.util.Scanner;

public class IOBasic {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter some char:");
        int ch=System.in.read();
        System.out.println((char)ch);

        int age;
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        System.out.println("Your age is: "+age);

        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Your name is: "+name);

        String username;
        String password;
        System.out.print("Username:");
        username=sc.next();
        System.out.print("Password:");
        password=sc.next();
        if(username.equals("admin") && password.equals("a123")){
            System.out.println("Welcome Admin");
        }else{
            System.out.println("Invalid username or password.");
        }
    }
}
