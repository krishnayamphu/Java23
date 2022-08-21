package com.mt.packagedemo;

public class EncapsulationDemo {
    public static void main(String[] args) {
        //read only
        Employee e=new Employee();
        System.out.println("Company: "+e.getCompany());

        //write only
        Student s=new Student();
        s.setName("Ram");

        //read and write
        Person p=new Person();
        p.setName("Ram");

        System.out.println("Person name: "+p.getName());
    }
}
