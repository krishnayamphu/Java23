package com.mt.oops;
class Employee{
    static String companyName="ABC Company";
    String employeeName;
}
public class StaticDemo2 {
    public static void main(String[] args) {
        StaticDemo.test();

        Employee e1=new Employee();
        e1.employeeName="Ram";
        System.out.println("Name: "+e1.employeeName);
        System.out.println("Company: "+Employee.companyName);

        System.out.println("=================");

        Employee e2=new Employee();
        e2.employeeName="Hari";
        System.out.println("Name: "+e2.employeeName);
        System.out.println("Company: "+Employee.companyName);
    }
}
