package com.mt.oops;
public class Student {
    private String name;
    private int age;
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ram";
        s1.age=20;

        Student s2=new Student();
        s2.name="Hari";
        s2.age=19;

        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("================");
        System.out.println("Name: "+s2.name);
        System.out.println("Age: "+s2.age);
    }
}
