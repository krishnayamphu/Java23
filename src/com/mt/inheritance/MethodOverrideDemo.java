package com.mt.inheritance;

class School{
    String schoolname;
    public void info(){
        System.out.println("showing some school info");
    }
}
class Student extends School{
    @Override
    public void info(){
        System.out.println("showing some student info");
    }
}
public class MethodOverrideDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.info();
    }
}
